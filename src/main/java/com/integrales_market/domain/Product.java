package com.integrales_market.domain;

public class Product {

    private int productId;
    private String name;
    private int categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;
    // Métodos set
    public void setProductId(int productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
    public void setPrice(double price) { this.price = price; }
    public void setStock(Integer stock) { this.stock = stock; }
    public void setActive(Boolean active) { this.active = active; }
    public void setCategory(Category category) { this.category = category; }

    // Métodos get ya deberían existir

    public Category getCategory() {
        return category;
    }

    public boolean isActive() {
        return active;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }
}



