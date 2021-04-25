package Homework9.com;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 120, 25000);
        Car mersedes = new Car("Mersedes", 200, 50000);
        Car audi = new Car("Audi", 100, 15000);
        Random random = new Random();
        try {
            audi.start();
        } catch (StartException e) {
            e.printStackTrace();
            System.out.println("Audi не завелась");
        }

        try {
            bmw.start();
        } catch (StartException e) {
            e.printStackTrace();
            System.out.println("BMW не завелась");
        }
        try {
            mersedes.start();
        } catch (StartException e) {
            e.printStackTrace();
            System.out.println("Mersedes не завелся");
        }
    }

}
