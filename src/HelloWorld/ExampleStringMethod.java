package HelloWorld;

public class ExampleStringMethod {

    public static void main(String[] args) {

        String name = "Victor";
        System.out.println("name.length() " + name.length());
        System.out.println("name.toUpperCase() " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        System.out.println("name.equals(\"Victor\") = " + name.equals("Victor"));
        System.out.println("name.equals(\"victor\") = " + name.equals("victor"));
        System.out.println("name.equalsIgnoreCase(\"victor\") = " + name.equalsIgnoreCase("victor"));

        System.out.println("name.compareTo(\"Victor\") = " + name.compareTo("Victor"));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));
        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(1,4) = " + name.substring(1,4));

        System.out.println("name.replace(\"c\",\"k\") = " + name.replace("c","k"));
        System.out.println("name = " + name);
        System.out.println("name.indexOf(\"c\") = " + name.indexOf("c"));
        System.out.println("name.lastIndexOf(\"t\") = " + name.lastIndexOf("t"));

        System.out.println("name.indexOf(\"z\") = " + name.indexOf("z"));
        System.out.println("name.contains(\"t\") = " + name.contains("t"));
        System.out.println("name.contains(\"tor\") = " + name.contains("tor"));

        System.out.println("name.startsWith(\"tor\") = " + name.startsWith("tor"));
        System.out.println("name.endsWith(\"tor\") = " + name.endsWith("tor"));

        System.out.println("  test  ".trim());
        
    }
}
