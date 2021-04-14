package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD", 8, 500, 2);
        computer.output();
        for (int i = 0; i < 3; i++) {
            computer.on();
            if (computer.burnedOut) {
                break;
            }
            computer.off();
            computer.numberOfCycles();

        }
    }
}
