package SystemClass;


public class ExampleRuntimeSO {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        Process process;

        try {
            if ( System.getProperty("os.name").toLowerCase().startsWith("windows") ){
                process = runtime.exec("notepad");
            } else if ( System.getProperty("os.name").toLowerCase().startsWith("mac") ){
                process = runtime.exec("textedit");
            }else if ( System.getProperty("os.name").toLowerCase().contains("linux") || System.getProperty("os.name").toLowerCase().contains("nix")){
                process = runtime.exec("gedit");
            } else {
                process = runtime.exec("gedit");
            }
            process.waitFor();
        } catch( Exception e){
            System.err.println("Unknown command -> "+ e.getMessage());
            System.exit(1);
        }
        System.out.println("Editor has been closed ");
        System.exit(0);

    }
}
