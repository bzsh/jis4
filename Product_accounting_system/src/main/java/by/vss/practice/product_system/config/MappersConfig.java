package by.vss.practice.product_system.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MappersConfig {

    @Bean
    ObjectMapper mapper() {
        return new ObjectMapper();
    }
}
