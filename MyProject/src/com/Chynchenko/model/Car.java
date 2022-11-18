package com.Chynchenko.model;

import java.util.Random;
public class Car {
    private String manufacturer;
    private Engine engine;
    private Colors color;
    private int count;
    private int price;

    public enum Colors
    {
        RED,
        BLACK,
        BLUE,
        WHITE,
        YELLOW,
        GREEN
    }
    Random random = new Random();
    public Car() {
    }

    public Car(String manufacturer, Engine engine, Colors color, int power, String type) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        this.count = 1;
        this.price = random.nextInt(2000, 90000);
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Colors getColor() {
        return color;
    }
    public void setColor(Colors color) {
        this.color = color;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}



