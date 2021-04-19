import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString

public class CivilianTranspotr extends AirTransport {
    private int numbersOfPassengers;//количество пассажиров
    private boolean bussinesClass;//наличие бизнес класса

    public CivilianTranspotr(int power, int maxSpeed, int weight, String carBrand, int wingspan, int length, int numbersOfPassengers, boolean bussinesClass) {
        super(power, maxSpeed, weight, carBrand, wingspan, length);
        this.numbersOfPassengers = numbersOfPassengers;
        this.bussinesClass = bussinesClass;
    }

    public void infoAbautNumberOfPassengers() {//метод для определения вместимости самолета
        System.out.println("Введите количство людей, которое вы хотите отправить на этом самолете: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (numbersOfPassengers <= count) {
            System.out.println("Вам нужен самолет побольше ");
        } else {
            System.out.println("Самолет загружен ");
        }
    }
    //  public void print(){
//        System.out.println("За время " ++ " ч, атомобиль " + + " двигался с максимальной скоростью" + + "км/ч проедет "+ + " км и израсходует "+ + "литров топлива.");
    //}
}
