package com.Chynchenko.service;
import java.util.Random;
import com.Chynchenko.model.Car;

public class CarService {
        Random random = new Random();
        public Car create() {
            Car car = new Car();
            car.setManufacturer(randomString());
            car.setEngine(randomString());
            car.setColor(randomColor());
            car.setCount(randomNumber());
            car.setPrice(randomNumber());
            return car;
        }
        public void print(Car car) {
            System.out.printf("Manufacturer: %s; Engine: %s, Color: %s; Count; %d; Price: %d.%n",
                    car.getManufacturer(), car.getEngine(), car.getColor(), car.getCount(), car.getPrice());
        }
        private String randomString() {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 10; i++) {
                int index = random.nextInt(alphabet.length());
                sb.append(alphabet.charAt(random.nextInt(alphabet.length() - 1)));
            }
            return sb.toString();
        }
        private String randomColor() {
            String[] colors = {"White", "Black", "Red", "Blue", "Yellow"};
            return colors[random.nextInt(colors.length)];
        }
        private int randomNumber() {
            return random.nextInt(1000, 100000);
        }
    }
}