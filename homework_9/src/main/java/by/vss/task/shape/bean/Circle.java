package by.vss.task.shape.bean;

import java.util.Objects;

public class Circle extends AbstractShape {
    protected double radius;
    protected double area;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;

    }

    public double getArea() {
        return Math.round(radius * radius * Math.PI);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Double.compare(circle.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius, area);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
