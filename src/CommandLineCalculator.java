public class CommandLineCalculator {

    public static void main(String[] args) {

        if ( args.length != 3){
            System.err.println("I entered the operation and two numbers ");
            System.exit(-1);
        }

        String operation = args[0];
        int a = 0;
        int b = 0;
        double result = 0.00;

        try {
            a = Integer.parseInt( args[1] );
            b = Integer.parseInt( args[2] );
        } catch ( NumberFormatException e){
            System.err.println("Careful a and b must be integer!");
            System.exit( -1);
        }



        switch( operation ){
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                if (  b == 0 ){
                    System.err.println("Cannot be divided by zero");
                    System.exit(-1);
                }
                result = (double)a / b;
                break;
            default:
                result = a + b;

        }
        System.out.println("Operation result '"+operation+"' = "+result);
    }
}
