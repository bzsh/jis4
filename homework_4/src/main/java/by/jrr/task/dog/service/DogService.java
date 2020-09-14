package by.jrr.task.dog.service;

import by.jrr.task.dog.bean.Dog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DogService {
    public static final Logger LOGGER = LogManager.getLogger(DogService.class);
    private Dog dog;

    public DogService(Dog dog) {
        LOGGER.info("DogService object is created");
        this.dog = dog;
    }

    public void voice() {
        LOGGER.info("Dog voices");
        System.out.println("Rrrr, gau-gau !");
    }

    public void eat() {
        LOGGER.info("Dog eats");
        System.out.println("Niam-niam !");
    }

    public void sleep() {
        LOGGER.info("Dog sleeps");
        System.out.println("z-z-z-z !");
    }
}
