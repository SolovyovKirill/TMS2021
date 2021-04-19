import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class GroundTrasport extends Transport {
    private int numberOfWheels;//количество колес
    private int fuelConsumption;//расход топлива

    public GroundTrasport(int power, int maxSpeed, int weight, String carBrand, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, carBrand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}

