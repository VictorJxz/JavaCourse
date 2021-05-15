package CommandLine;

public class CommandLineArgument {

    public static void main(String[] args) {

        for ( int i = 0; i < args.length; i++){
            System.out.println("Arguments n° " + i +" : "+args[i]);
        }
    }
}
