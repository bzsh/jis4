package by.vss.task.animal.bean;

import java.util.Objects;

public abstract class Animal {
    private static final String PEE = "Animal pissing)";
    String color;
    String gender;
    int numberOfLegs;
    int weight;
    int age;

    public Animal(String color, String gender, int numberOfLegs, int weight, int age) {
        this.color = color;
        this.gender = gender;
        this.numberOfLegs = numberOfLegs;
        this.weight = weight;
        this.age = age;
    }
    protected abstract String sleep();
    protected abstract String eat();
    protected abstract String move();
    protected abstract String say();

    protected String pee(){
        return PEE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return numberOfLegs == animal.numberOfLegs &&
                weight == animal.weight &&
                age == animal.age &&
                Objects.equals(color, animal.color) &&
                Objects.equals(gender, animal.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, gender, numberOfLegs, weight, age);
    }
}
