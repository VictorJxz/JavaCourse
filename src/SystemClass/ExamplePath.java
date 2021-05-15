package SystemClass;

import java.util.Map;

public class ExamplePath {

    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("System environment variable = " + varEnv);
        System.out.println("#.......    System environment variable list     .................");
        for ( String key: varEnv.keySet()){
            System.out.println(key+" -> "+ varEnv.get( key ));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);

        String path = varEnv.get("Path");
        System.out.println("path = " + path);

    }
}
