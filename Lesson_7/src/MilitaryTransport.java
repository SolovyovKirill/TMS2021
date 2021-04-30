import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class MilitaryTransport extends AirTransport {
    private boolean ejectionSystem;//наличие системы катапультирования
    private int numberOfMissiles;//количестов ракет на борту

    public MilitaryTransport(int power, int maxSpeed, int weight, String carBrand, int wingspan, int length, boolean ejectionSystem, int numberOfMissiles) {
        super(power, maxSpeed, weight, carBrand, wingspan, length);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    public void shot() {// метод пуск ракеты
        if (numberOfMissiles != 0) {
            System.out.println("Ракета пошла!!! ");
        } else {
            System.out.println("Боеприпасы отсутствуют ");
        }
        System.out.println();
    }

    public void ejectionSystem() {// метод для определния наличия систесы катапультирования
        if (ejectionSystem != true) {
            System.out.println("У нас нет такой системы ");
        } else {
            System.out.println("Катапультирование прошло успешно");
        }
    }
}
