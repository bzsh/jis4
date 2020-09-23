package by.vss.task.animal.bean;

import java.util.Objects;

public class Parrot extends Bird{
    private static final String PARROT_SLEEP = "Parrot is sleeping";
    private static final String PARROT_EAT = "Parrot is eating";
    private static final String PARROT_MOVE= "Parrot is moving";
    private static final String PARROT_SAY = "The Parrot says : Tiu tiu";
    private static final String PARROT_FLY = "Parrot is flying";
    private String parrotBreed;

    public Parrot(String color, String gender, int numberOfLegs, int weight, int age, String featherColor) {
        super(color, gender, numberOfLegs, weight, age, featherColor);
    }
    @Override
    public String fly() {
        return PARROT_FLY;
    }

    @Override
    public String sleep() {
        return PARROT_SLEEP;
    }

    @Override
    public String eat() {
        return PARROT_EAT;
    }

    @Override
    public String move() {
        return PARROT_MOVE;
    }

    @Override
    public String say() {
        return PARROT_SAY;
    }

    public String getParrotBreed() {
        return parrotBreed;
    }

    public void setParrotBreed(String parrotBreed) {
        this.parrotBreed = parrotBreed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return Objects.equals(parrotBreed, parrot.parrotBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parrotBreed);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "parrotBreed='" + parrotBreed + '\'' +
                ", featherColor='" + featherColor + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
