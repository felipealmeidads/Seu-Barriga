package br.com.herokuapp.srbarriga.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesManager {

    public static String getPropertiesValue(String valor){
        Properties prop = new Properties();
        File file = new File("src/main/resources");
        try {
            prop.load(new FileInputStream(file.getAbsolutePath()+"/application.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(valor);
    }
}
