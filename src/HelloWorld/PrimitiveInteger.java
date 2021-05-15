package HelloWorld;

public class PrimitiveInteger {

    public static void main(String[] args) {
        byte numberByte = 127;
        System.out.println("numberByte = "+numberByte);
        System.out.println("Byte type corresponds in byte to "+ Byte.BYTES);
        System.out.println("Byte type corresponds in bytes to "+Byte.SIZE );
        System.out.println("Maximum value of a byte "+Byte.MAX_VALUE);
        System.out.println("Minimum value of a byte "+Byte.MIN_VALUE);

        short numberShort = 32767;
        System.out.println("numberShort = "+numberShort);
        System.out.println("Short type corresponds in byte to "+ Short.BYTES);
        System.out.println("Short type corresponds in bytes to "+Short.SIZE );
        System.out.println("Maximum value of a short "+Short.MAX_VALUE);
        System.out.println("Minimum value of a short "+Short.MIN_VALUE);

        int numberInt = 2147483647;
        System.out.println("numberInt = "+numberInt);
        System.out.println("Int type corresponds in byte to "+ Integer.BYTES);
        System.out.println("Int type corresponds in bytes to "+Integer.SIZE );
        System.out.println("Maximum value of a int "+Integer.MAX_VALUE);
        System.out.println("Minimum value of a int "+Integer.MIN_VALUE);

        long numberLong = 9223372036854775807L;
        System.out.println("numberInt = "+numberInt);
        System.out.println("Long type corresponds in byte to "+ Long.BYTES);
        System.out.println("Long type corresponds in bytes to "+Long.SIZE );
        System.out.println("Maximum value of a long "+Long.MAX_VALUE);
        System.out.println("Minimum value of a long "+Long.MIN_VALUE);

        var numberVar = 2147483648L;
    }
}
