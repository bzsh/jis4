package by.vss.practice.product_system.bean;

import by.vss.practice.product_system.category.Category;
import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private long id;
    private String name;
    private BigDecimal price;
    private Category category;
    private BigDecimal discount;
    private String description;

    public Product(long id, String name, BigDecimal price, Category category, BigDecimal discount, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.discount = discount;
        this.description = description;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Product product = (Product)o;
            return this.id == product.id && Objects.equals(this.name, product.name) && Objects.equals(this.price, product.price) && this.category == product.category && Objects.equals(this.discount, product.discount) && Objects.equals(this.description, product.description);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.price, this.category, this.discount, this.description});
    }

    public String toString() {
        return "Product : id = " + this.id + ", name = " + this.name + ", price = " + this.price + ", category = " + this.category + ", discount = " + this.discount + ", description = " + this.description;
    }
}

