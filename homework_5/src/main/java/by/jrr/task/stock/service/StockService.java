package by.jrr.task.stock.service;

import by.jrr.task.stock.bean.Stock;

public class StockService {
    public void updateCurrentCost(Stock stock, int cost) {
        if (cost < stock.getMinCost()) {
            stock.setMinCost(cost);
        } else if (cost > stock.getMaxCost()) {
            stock.setMaxCost(cost);
        }
        stock.setCurrentCost(cost);
    }

    public String printInformation(Stock stock) {
        return stock.toString();
    }
}