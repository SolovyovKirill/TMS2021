import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class AirTransport extends Transport {
    private int wingspan;//размах крыльев
    private int length;//минимальная длина взлётно-посадочной полосы

    public AirTransport(int power, int maxSpeed, int weight, String carBrand, int wingspan, int length) {
        super(power, maxSpeed, weight, carBrand);
        this.wingspan = wingspan;
        this.length = length;
    }
}
