package by.vss.practice.product_system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class ScannerConfig {

    @Bean
    Scanner scanner() {
        return new Scanner(System.in);
    }
}
