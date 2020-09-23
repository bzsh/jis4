package by.vss.task.animal.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void pee() {
        Animal dog = new Dog("Brown", "Male", 4,10, 8, "street hound");
        String expected = "Animal pissing)";
        String actual = dog.pee();
        assertEquals(expected, actual);
    }
}