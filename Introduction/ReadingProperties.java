package Introduction;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Softwares\\Java\\Introduction\\ReadingPropertiesFile.properties";

        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream(path);

        prop.load(fs);
        
        System.out.println(prop.getProperty("Name"));
        System.out.println(prop.getProperty("name"));  // case-sensitive
        System.out.println(prop.getProperty("Course"));
        System.out.println(prop.getProperty("Sub-Course"));
        System.out.println(" ");

        System.out.println("*********************************************************");
        prop.clear();
        
       
        System.out.println(prop.getProperty("Name"));
        System.out.println(prop.getProperty("name"));  // case-sensitive
        System.out.println(prop.getProperty("Course"));
        System.out.println(prop.getProperty("Sub-Course"));
        System.out.println(" ");


        System.out.println("*********************************************************");
       // FileWriter fw = new FileWriter(path);

        prop.put("Course", "python");
        
        System.out.println(prop.getProperty("Name"));
        System.out.println(prop.getProperty("name"));  // case-sensitive
        System.out.println(prop.getProperty("Course"));
        System.out.println(prop.getProperty("Sub-Course"));
        System.out.println(" ");

        System.out.println("*********************************************************");

        prop.setProperty("Name", "Komal");

        System.out.println(prop.getProperty("Name"));
        System.out.println(prop.getProperty("name"));  // case-sensitive
        System.out.println(prop.getProperty("Course"));
        System.out.println(prop.getProperty("Sub-Course"));
        System.out.println(" ");

        FileWriter fw = new FileWriter(path);
        fw.write("This is file writer");
        fw.append(" a");
        fw.close();
    }
    
    
}
