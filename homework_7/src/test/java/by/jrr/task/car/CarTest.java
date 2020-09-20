package by.jrr.task.car;

import by.jrr.task.car.bean.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testEqualsShouldReturnFalse() {
        Car ferrariCar = new Car("Ferrari", "Red", 350, 0);
        Car audiCar = new Car("Audi", "Silver", 270, 0);
        boolean actual = ferrariCar.equals(audiCar);
        assertFalse(actual);
    }

    @Test
    public void testEqualsWithNull() {
        Car ferrariCar = new Car("Ferrari", "Red", 350, 0);
        Car audiCar = new Car("Audi", "Silver", 270, 0);
        boolean actual = ferrariCar.equals(audiCar);
        assertFalse(actual);
    }

    @Test
    public void testEqualsShouldReturnTrue() {
        Car ferrariCar = new Car("Ferrari", "Red", 350, 0);
        Car car = new Car("Ferrari", "Red", 350, 0);
        boolean actual = ferrariCar.equals(car);
        assertTrue(actual);
    }

    @Test
    public void testHashCode() {
        Car car = new Car("Ferrari", "Red", 350, 0);
        int expected = -862025509;
        int actual = car.hashCode();
        assertEquals(expected, actual);
    }


    @Test
    public void testToString() {
        Car car = new Car("Ferrari", "Red", 350, 0);
        String expected = "Car{model='Ferrari', color='Red', maxSpeed=350, currentSpeed=0}";
        String actual = car.toString();

        assertEquals(expected, actual);
    }
}