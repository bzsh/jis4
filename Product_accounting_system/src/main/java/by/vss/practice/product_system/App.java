package by.vss.practice.product_system;

import by.vss.practice.product_system.ui.ConsoleUI;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(App.class)
                .getBean(ConsoleUI.class)
                .mainMenu();

//        Arrays.stream(new AnnotationConfigApplicationContext(App.class)
//                .getBeanDefinitionNames())
//                .forEach(System.out::println);

//        try {
//            new AnnotationConfigApplicationContext(App.class)
//            .getBean(FileProductDatabase.class)
//            .addAllToFile(new ArrayList<>());
//        } catch (ProductFileDatabaseException e) {
//            e.printStackTrace();
//        }
    }
}
