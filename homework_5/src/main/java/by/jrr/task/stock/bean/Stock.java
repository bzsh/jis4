package by.jrr.task.stock.bean;

import java.util.Objects;

public class Stock {
    private String name;
    private int currentCost;
    private int maxCost;
    private int minCost;

    public Stock(String name, int currentCost) {
        this.name = name;
        this.currentCost = currentCost;
        this.maxCost = currentCost;
        this.minCost = currentCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(int currentCost) {
        this.currentCost = currentCost;
    }

    public int getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(int maxCost) {
        this.maxCost = maxCost;
    }

    public int getMinCost() {
        return minCost;
    }

    public void setMinCost(int minCost) {
        this.minCost = minCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;
        Stock stock = (Stock) o;
        return currentCost == stock.currentCost &&
                maxCost == stock.maxCost &&
                minCost == stock.minCost &&
                Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentCost, maxCost, minCost);
    }

    @Override
    public String toString() {
        return  "Company = \"" + getName() + "\", Current Price = " + getCurrentCost() + ", Min Price = " + getMinCost() + ", Max Price = " + getMaxCost();
    }
}