package SystemClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AssignSystemProperties {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/SystemClass/config.properties");
            Properties properties = new Properties( System.getProperties() );
            properties.load( file );
            properties.setProperty("test.properties.xsr","Value saved in properties object");

            System.setProperties( properties );
            Properties properties1 = System.getProperties();
            System.out.println(".....................................................");
            System.out.println("properties1.getProperty(test.properties.xsr) = " + properties1.getProperty("test.properties.xsr"));
            System.out.println( System.getProperty("config.port.server") );
            System.out.println(".....................................................");

            properties1.list( System.out );

        } catch( Exception e ){
            System.err.println("File does not exist " + e);
            System.exit(1);
        }

    }
}
