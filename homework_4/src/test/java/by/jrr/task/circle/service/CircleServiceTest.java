package by.jrr.task.circle.service;

import by.jrr.task.circle.bean.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleServiceTest {

    @Test
    public void calculateArea() {
        CircleService service = new CircleService(new Circle(5.5));
        double expected = 95.03317777109125;
        double actual = service.calculateArea();
        assertEquals(expected, actual, 0);
    }
}