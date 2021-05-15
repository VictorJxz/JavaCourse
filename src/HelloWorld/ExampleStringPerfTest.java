package HelloWorld;

public class ExampleStringPerfTest {
    public static void main(String[] args){

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long start = System.currentTimeMillis();

        for ( int i = 0; i < 1000; i++){
            // c = c.concat(a).concat(b).concat("\n");    // 500  4ms
            // c += a + b + "\n";  // 500 27ms
            sb.append(a).append(b).append("\n");  // 500 1ms
        }

        // #.........     Speed up garbage collector   ................
        System.gc();

        long end = System.currentTimeMillis();
        System.out.println( end - start);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

        System.exit(0);
    }
}
