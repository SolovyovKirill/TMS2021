package com.home.model;

import java.util.Scanner;

public class Computer {
    public boolean burnedOut;
    String processor;
    int ram;
    int hardDrive;
    int fullCycleResource;
    Boolean turnedOn;


    public Computer(String processor, int ram, int hardDrive, int fullCycleResource) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.fullCycleResource = fullCycleResource;
    }

    public void output() {
        System.out.println("Процессор " + processor + ". Оперативная память " + ram + " GB. Жесткий диск на " + hardDrive + " GB. Ресурс полный циклов равен " + fullCycleResource);
    }

    public boolean on() {
        if (!burnedOut) {
            if (fullCycleResource != 0 && action()) {
                turnedOn = true;
                System.out.println("Компьютер включен");
                return true;
            } else {
                System.out.println("Компьюетр не включится");
                burnedOut = true;
                return false;
            }
        } else {
            System.out.println("Компьютер сгорел");
            return false;
        }
    }

    public void off() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Компьютер выключен");
            fullCycleResource--;
        }
    }

    public boolean action() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                int x = scanner.nextInt();
                if (x == 0 || x == 1) {
                    int rand = (int) (Math.random() * 2);
                    return true;
                }
            }
        }
    }

    public void numberOfCycles() {
        System.out.println("Циклов осталось - " + fullCycleResource);
    }
}

