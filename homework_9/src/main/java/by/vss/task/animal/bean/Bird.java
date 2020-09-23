package by.vss.task.animal.bean;

import java.util.Objects;

public abstract class Bird extends Animal {
    protected String featherColor;

    public Bird(String color, String gender, int numberOfLegs, int weight, int age, String featherColor) {
        super(color, gender, numberOfLegs, weight, age);
        this.featherColor = featherColor;
    }

    protected abstract String fly();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(featherColor, bird.featherColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), featherColor);
    }
}
