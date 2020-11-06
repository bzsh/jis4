package by.vss.practice.product_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class PropertiesConfig {

    @Bean
    public Properties properties() {
        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream("Product_accounting_system/src/main/resources/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appProps;
    }
}
