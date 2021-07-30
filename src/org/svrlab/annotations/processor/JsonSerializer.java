package org.svrlab.annotations.processor;

import org.svrlab.annotations.Init;
import org.svrlab.annotations.JsonAttribute;
import org.svrlab.annotations.processor.exeption.JsonSerializerException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;


public class JsonSerializer {

    public static void initObject( Object object) {
        if (Objects.isNull( object )) {
            throw new JsonSerializerException("The object to be realized cannot be null!");
        }

        //The Java reflection API
        Method[] methods = object.getClass().getDeclaredMethods();
        Arrays.stream( methods ).filter( method -> method.isAnnotationPresent(Init.class))
                .forEach( m -> {
                    m.setAccessible( true );
                    try {
                        m.invoke( object );
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializerException("Error when serializing, can't init Object"+ e.getMessage());
                    }
                });
    }

    public static String convertJson( Object object) {


        if (Objects.isNull( object )) {
            throw new JsonSerializerException("The object to be realized cannot be null!");
        }
        initObject( object );

        //The Java reflection API
        Field[] attributes = object.getClass().getDeclaredFields();

        return Arrays.stream( attributes )
                .filter( f ->  f.isAnnotationPresent( JsonAttribute.class ))
                .map( f -> {
                    //The Java reflection API allows us to read the metadata of our classes and work with them.
                    f.setAccessible( true );
                    String name = f.getAnnotation( JsonAttribute.class).name().equals("")
                            ? f.getName()
                            : f.getAnnotation( JsonAttribute.class).name();
                    try {
                        Object value  = f.get( object );
                        if ( f.getAnnotation( JsonAttribute.class).capatalize() && value instanceof String) {
                            String newValue = (String)value;

                            f.set( object, newValue );
                        }
                        return "\"" + name + "\":\"" + f.get( object ) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializerException("Error when serializing JSON "+ e.getMessage());
                    }
                })
                .reduce("{", ( a, b) -> {
                    if("{".equals(a)) {
                        return a + b;
                    }
                    return a + " , " + b;
                }).concat("}");
    }
}
