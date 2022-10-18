package com.code.develop.property;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;


@PropertySource("classpath:email.properties")
@Component
public class PropertieWriter {
    public Properties getPropertyInformation() {
        FileReader reader = null;
        Properties p = null;
  
       
        
        File file = null;
        try {
        	file = new ClassPathResource("email.properties").getFile();
            reader = new FileReader(file);

            p = new Properties();
            p.load(reader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p;
    }
}