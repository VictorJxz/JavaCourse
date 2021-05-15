package HelloWorld;

public class ExampleStringMethodArray {

    public static void main(String[] args) {

        String name = "Victor";
        System.out.println("name.toCharArray() = " + name.toCharArray());

        char[] arrayx = name.toCharArray();
        int longs = arrayx.length;

        for (int i = 0; i < longs; i++){
            System.out.println("arrayx[i] = " + arrayx[i]);
        }

        String data = "data test @virus @hdr @svr";
        System.out.println("data.split(\"@\") = " + data.split("@"));

        String[] arrayxy = data.split("@");
        int l = arrayxy.length;

        for ( int i = 0; i < l; i++){
            System.out.println(arrayxy[i]);
        }

        String filex = "files.xl.js";
        String[] fileArr = filex.split("\\."); // [.]
        l = fileArr.length;
        System.out.println("l = " + l);

        for (int i = 0; i<l; i++){
            System.out.println( fileArr[i]);
        }
        System.out.println("extension = " + fileArr[l-1]);

        
    }
}
