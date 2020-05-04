package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by genta on 17/03/17.
 */
public class getEnv {

    File file;
    String filePath = "src/test/java/Utilities/env.properties";
    FileInputStream fileInputStream;
    Properties properties;

    public Properties setProperties() {
        try {
            file = new File(filePath);
            fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
//        System.out.println(properties.getProperty("username"));
//        System.out.println(properties.getProperty("password"));
    }

    public String getUsername() {
        Properties usernameProp = setProperties();
        return (usernameProp.getProperty("username"));
    }

    public String getPassword() {
        Properties passwdProp = setProperties();
        return (passwdProp.getProperty("password"));
    }

}
