package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties = new Properties();

    static {
        try {
            //2 We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties objecft using FileInputStream object
            properties.load(file);

            //close the file
            file.close();



        } catch (IOException e) {
            System.out.println("Something happened in the ConfigurationReader class");
            e.printStackTrace();
        }

    }

}
