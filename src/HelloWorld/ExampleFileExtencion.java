package HelloWorld;

public class ExampleFileExtencion {

    public static void main(String[] args) {

        String file = "some_image.jpeg";
        int i = file.lastIndexOf(".");
        System.out.println("file.length() = " + file.length());
        System.out.println("file.substring(file.length()-4) = " + file.substring(i+1));

    }
}
