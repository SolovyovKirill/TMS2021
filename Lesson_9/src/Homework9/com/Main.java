package Homework9.com;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 120, 25000);
        Car mersedes = new Car("Mersedes", 200, 50000);
        Car audi = new Car("Audi", 100, 15000);
        Car[] cars = {bmw, mersedes, audi};
        for (Car car : cars) {
            try {
                car.start();
            } catch (StartException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
