package com.Chynchenko.service;
import java.util.Random;
import com.Chynchenko.model.Car;
import com.Chynchenko.model.Engine;

public class CarService {

        public Car create() {
            Car car = new Car();
            car.setManufacturer(randomString());
            car.setEngine(new Engine());
            car.setColor(randomColor());
            car.setCount(randomNumber());
            car.setPrice(randomNumber());
            return car;
        }
        public void print(Car car) {
            System.out.printf("Manufacturer: %s; Engine: %s, Color: %s; Count; %d; Price: %d.%n",
                    car.getManufacturer(), car.getEngine(), car.getColor(), car.getCount(), car.getPrice());
        }
    Random random = new Random();
        private String randomString() {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 10; i++) {
                random.nextInt(alphabet.length());
                sb.append(alphabet.charAt(random.nextInt(alphabet.length() - 1)));
            }
            return sb.toString();
        }
        private int randomNumber() {
            return random.nextInt(1000, 100000);
        }

        private Car.Colors randomColor(){return randomColor();}

    public void check(final Car car) {
        if (car.getCount() > 0 && car.getEngine().getPower() > 200) {
            System.out.println("Car is ready to sell");
        } else if (car.getCount() > 0) {
            System.out.println("Power of engine is not enough");
        } else if (car.getEngine().getPower() > 200) {
            System.out.println("The amount of cars is 0");
        } else {
            System.out.println("Power of engine is not enough and amount of cars is 0");
        }
    }
    }
