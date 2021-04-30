import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString

public class PassengerTransport extends GroundTrasport {
    private String bodyType;//тип кузова
    private int numberofPassengers;//количество пассажиров


    public PassengerTransport(int power, int maxSpeed, int weight, String carBrand, int numberOfWheels, int fuelConsumption, String bodyType, int numberofPassengers) {
        super(power, maxSpeed, weight, carBrand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberofPassengers = numberofPassengers;
    }

    public void distanceAndFuel() {//метод для определения расстояния и расхода топлива
        System.out.println("Введите сколько времени ехала машина с максимально скоростью: ");
        Scanner scanner = new Scanner(System.in);
        double count = scanner.nextInt();
        double distance = getMaxSpeed() * count;
        double fuel = getFuelConsumption() * (distance / 100);
        System.out.println("За время " + count + " ч, автомобиль " + getCarBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет " + distance + " км и израсходует " + fuel + " литров топлива.");
    }

    public void power_kW() {// метод для перевод л.с. в кВТ
        double power_kW = getPower() * 0.74;
    }

}
