package by.jrr.task.car.service;

import by.jrr.task.car.bean.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarServiceTest {

    Car car;
    CarService carService;

    @Before
    public void setUp(){
        car = new Car("Audi", "gold", 260, 0);
        carService = new CarService(car);
    }

    @Test
    public void accelerate() {
        carService.accelerate(50);
        int expected = 50;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual);
    }

    @Test
    public void accelerateUpToMaxSpeed() {
        car.setCurrentSpeed(0);
        carService.accelerate(500);
        int expected = 260;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual);
    }

    @Test
    public void accelerateShouldHoldCurrentSpeed() {
        car.setCurrentSpeed(50);
        carService.accelerate(40);
        int expected = 50;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual);
    }

    @Test
    public void decelerate() {
        car.setCurrentSpeed(50);
        carService.decelerate(270);
        int expected = 50;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual);
    }

    @Test
    public void decelerateDownToZero() {
        car.setCurrentSpeed(50);
        carService.decelerate(0);
        int expected = 0;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual);
    }

    @Test
    public void decelerateShouldHoldCurrentSpeed() {
        car.setCurrentSpeed(50);
        carService.decelerate(300);
        int expected = 50;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual);
    }

    @Test
    public void isDrivingShouldReturnTrue() {
        car.setCurrentSpeed(50);
        assertTrue(carService.isDriving());
    }

    @Test
    public void isDrivingShouldReturnFalse() {
        car.setCurrentSpeed(0);
        assertFalse(carService.isDriving());
    }

    @Test
    public void isStoppedShouldReturnFalse() {
        car.setCurrentSpeed(50);
        assertFalse(carService.isStopped());
    }

    @Test
    public void isStoppedShouldReturnTrue() {
        car.setCurrentSpeed(0);
        assertTrue(carService.isStopped());
    }

    @Test
    public void canAccelerateShouldReturnTrue() {
        car.setCurrentSpeed(50);
        assertTrue(carService.canAccelerate());
    }

    @Test
    public void canAccelerateShouldReturnFalse() {
        car.setCurrentSpeed(260);
        assertFalse(carService.canAccelerate());
    }
}