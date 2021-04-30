package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder strB = new StringBuilder();
        strB.append(str);
        strB = strB.reverse();
        if (str.equalsIgnoreCase(String.valueOf(strB))) {
            System.out.println("Слово " + str + " - палиндром.");
        }
    }
}
