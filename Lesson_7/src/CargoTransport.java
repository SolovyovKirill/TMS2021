import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString

public class CargoTransport extends GroundTrasport {
    private int loadCapacity;//грузоподъёмность

    public CargoTransport(int power, int maxSpeed, int weight, String carBrand, int numberOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, carBrand, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void infoAbautLoadCapacity() {
        System.out.println("Введите количство груза, которое вы хотите загрузить в этот грузовик: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (loadCapacity <= count) {
            System.out.println("Вам нужен грузовик побольше ");
        } else {
            System.out.println("Грузовик загружен ");
        }
    }
}
