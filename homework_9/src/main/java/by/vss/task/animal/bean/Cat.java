package by.vss.task.animal.bean;

import java.util.Objects;

public class Cat extends Mammal{
    private static final  String CAT_SLEEP = "Cat is sleeping";
    private static final  String CAT_EAT = "Cat is eating";
    private static final  String CAT_MOVE= "Cat is moving";
    private static final  String CAT_SAY = "The Cat says : Miau-Miau";
    private String catBreed;

    public Cat(String color, String gender, int numberOfLegs, int weight, int age, String catBreed) {
        super(color, gender, numberOfLegs, weight, age);
        this.catBreed = catBreed;
    }

    @Override
    public String sleep() {
        return CAT_SLEEP;
    }

    @Override
    public String eat() {
        return CAT_EAT;
    }

    @Override
    public String move() {
        return CAT_MOVE;
    }

    @Override
    public String say() {
        return CAT_SAY;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(catBreed, cat.catBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), catBreed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed='" + catBreed + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
