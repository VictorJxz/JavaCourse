package org.svrlab.recursion;

import org.svrlab.recursion.models.Component;

import java.util.stream.Stream;

public class ExampleRecursion {

    public static void main(String[] args) {

        Component pc = new Component("Gabinete PC ATX");
        Component power = new Component("Fuente Poder 700w");
        Component motherboard = new Component("MainBoard Asus sockets AMD");
        Component cpu = new Component("Cpu AMD Ryzen 5 2800");
        Component ventilator = new Component("Ventilador CPU");
        Component sink = new Component("Desipador");
        Component tv = new Component("Nvidia RTX 3080 8G");
        Component gpu = new Component("Nvidia GPU RTX");
        Component gpuRam = new Component("4GB Ram");
        Component gpuRam2 = new Component("4GB Ram");
        Component gpuVentilator = new Component("Ventilator");
        Component ram = new Component("Memoria Ram 32GB");
        Component ssd = new Component("Disco SSD 2T");

        cpu.addComponent( ventilator).addComponent( sink );
        tv.addComponent( gpu )
                .addComponent( gpuRam )
                .addComponent( gpuRam2 )
                .addComponent( gpuVentilator );
        motherboard.addComponent( cpu )
                .addComponent( tv )
                .addComponent( ram )
                .addComponent( ssd );
        pc.addComponent( power )
                .addComponent( motherboard )
                .addComponent( new Component("Teclado"))
                .addComponent( new Component("Mouse"));

        methodRecursiveJava8( pc, 0 )
                .forEach( c -> System.out.println("\t".repeat( c.getLevel()) + c.getName()));
    }

    public static Stream<Component> methodRecursiveJava8(Component component, int level ) {

        component.setLevel( level );
        return Stream.concat( Stream.of( component ),
                component.getChild().stream().flatMap( child -> methodRecursiveJava8( child, level + 1)) );
    }

    public static void methodRecursive( Component component, int level ) {
        System.out.println("\t".repeat( level ) + component.getName());

        if ( component.hasChildren() ){
            for( Component child: component.getChild() ){
                methodRecursive( child, level + 1 );
            }
        }
    }


}
