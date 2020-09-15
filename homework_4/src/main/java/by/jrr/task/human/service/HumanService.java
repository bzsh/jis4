package by.jrr.task.human.service;

import by.jrr.task.human.bean.Human;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HumanService {
    public static final Logger LOGGER = LogManager.getLogger(HumanService.class);
    private Human human;

    public HumanService(Human human) {
        LOGGER.info("HumanService object has been created");
        this.human = human;
    }

    public void greet(){
        LOGGER.info("Human says");
        System.out.println("Hello !");
    }
}
