package ClassWrapper;

import java.lang.reflect.Method;

public class GetClassMetho {

    public static void main(String[] args) {

        String text = "Hi, How are you";
        Class strClass = text.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);
        System.out.println(".................................................");

        for (Method metod: strClass.getMethods() ){
            System.out.println("metod.getName() = " + metod.getName());
        }
        System.out.println(".................................................");

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();

        System.out.println("intClass = " + intClass.getSimpleName());
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass()= " + objClass);
        System.out.println(".................................................");

        for (Method metod: objClass.getMethods() ){
            System.out.println("metod.getName() = " + metod.getName());
        }

    }
}
