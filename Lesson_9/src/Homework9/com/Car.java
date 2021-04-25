package Homework9.com;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws StartException {
        Random random = new Random();
        int rand = random.nextInt(20);
        if ((rand % 2) == 0) {
            throw new StartException();
        } else {
            System.out.println("Машина завелась!");
        }

    }
}
