package com.weborders.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties =new Properties();

    static {
        try(InputStream in = new FileInputStream("configuration.properties")){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("failed to read configuration.properties file");
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
