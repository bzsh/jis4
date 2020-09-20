package by.jrr.task.car.service;

import by.jrr.task.car.bean.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarService implements CarServiceInterface {
    public static final Logger LOGGER = LogManager.getLogger(CarService.class);
    Car car;

    public CarService(Car car) {
        this.car = car;
    }

    @Override
    public void accelerate(int targetSpeed) {
        LOGGER.info("car is accelerating");
            while (car.getCurrentSpeed() < targetSpeed && car.getCurrentSpeed() < car.getMaxSpeed()) {
                car.setCurrentSpeed(car.getCurrentSpeed() + 1);
            }
    }

    @Override
    public void decelerate(int targetSpeed) {
        LOGGER.info("car is decelerating");
            while (car.getCurrentSpeed() > targetSpeed && car.getCurrentSpeed() > 0) {
                car.setCurrentSpeed(car.getCurrentSpeed() - 1);
            }
        }

    @Override
    public boolean isDriving() {
        return car.getCurrentSpeed() > 0;
    }

    @Override
    public boolean isStopped() {
        return car.getCurrentSpeed() == 0;
    }

    @Override
    public boolean canAccelerate() {
        return car.getCurrentSpeed() < car.getMaxSpeed();
    }
}
