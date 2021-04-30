import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Transport {//Класс транспорт
    private int power;//мощность
    private int maxSpeed;//максимальная скорость
    private int weight;//масса
    private String carBrand;//Марка

    public Transport(int power, int maxSpeed, int weight, String carBrand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carBrand = carBrand;
    }
}
