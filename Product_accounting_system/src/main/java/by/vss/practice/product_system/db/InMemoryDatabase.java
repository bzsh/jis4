package by.vss.practice.product_system.db;

import by.vss.practice.product_system.bean.GeneratedId;
import by.vss.practice.product_system.bean.Product;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {
    public static final Map<Long, Product> products = new HashMap<>();
    public static final Map<Long, GeneratedId> idTable = new HashMap<>();
}
