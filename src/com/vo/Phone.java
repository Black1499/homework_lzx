package com.vo;

import java.util.Date;

public class Phone {
    int id;
    String brand;
    String name;
    int price;
    Date date;
    int stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Phone() {
    }

    public Phone(int id, String brand, String name, int price, Date date, int stock) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.date = date;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", stock=" + stock +
                '}';
    }
}
