package by.vss.task.shape.bean;

import java.util.Objects;

public class Square extends AbstractShape {
    protected double side;
    protected double area;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.round(side * side);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Double.compare(square.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side, area);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
