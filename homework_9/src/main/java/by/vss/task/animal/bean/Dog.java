package by.vss.task.animal.bean;

import java.util.Objects;

public class Dog extends Mammal {
    private static final String DOG_SLEEP = "Dog is sleeping";
    private static final String DOG_EAT = "Dog is eating";
    private static final String DOG_MOVE = "Dog is moving";
    private static final String DOG_SAY = "The Dog says : Hau HAu";
    private String dogBreed;

    public Dog(String color, String gender, int numberOfLegs, int weight, int age, String dogBreed) {
        super(color, gender, numberOfLegs, weight, age);
        this.dogBreed = dogBreed;
    }

    @Override
    public String sleep() {
        return DOG_SLEEP;
    }

    @Override
    public String eat() {
        return DOG_EAT;
    }

    @Override
    public String move() {
        return DOG_MOVE;
    }

    @Override
    public String say() {
        return DOG_SAY;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(dogBreed, dog.dogBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dogBreed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogBreed='" + dogBreed + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
