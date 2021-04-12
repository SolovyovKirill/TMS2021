package com.home.model;

import java.util.Random;
import java.util.Scanner;

public  class Computer {
    String processor;
    int ram;
    int hardDrive;
    int fullCycleResource;
    int count;

    public void output() {
        System.out.printf("Процессор " + processor + ". Оперативная память " + ram + " GB. Жесткий диск на " + hardDrive + " GB. Ресурс полный циклов равен " + fullCycleResource);
    }
    public void on(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внимание! Введите 0 или 1");
        int number;
        number = scanner.nextInt();
        Random random = new Random();
        count = random.nextInt(1);
        if (count == number) {
            off();
        } else if (count != number){
            System.out.println("Компьютер сгоре!");
        }
        for (int i = 0; i < fullCycleResource; i++) {
            if (i >= fullCycleResource) {
                System.out.println("Компьютер сгоре!");
            }

        }

    }
    public void off(){
        System.out.println("Компьютер выключен");

    }
    public void computerBurnedOut(){
        System.out.println("Компьютер сгорел!");

    }

}
