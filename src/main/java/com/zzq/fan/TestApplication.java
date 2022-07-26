package com.zzq.fan;

import com.zzq.fan.pojo.Fan;


import java.util.Scanner;

public class TestApplication {
    public static void main(String[] args) {

        Fan fan = new Fan();
        System.out.println("Fan init values:");
        System.out.println(fan);
        menuOptions();

        Scanner scanner = new Scanner(System.in);

        label:
        while (scanner.hasNext()) {
            String userInput = scanner.next().toUpperCase();
            switch (userInput) {
                case "D":
                    fan.reverseDirection();
                    break;
                case "S":
                    fan.speedGoUp();
                    break;
                case "Q":
                    break label;
                default:
                    System.out.println("invalid input...");
                    break;
            }
            System.out.println(fan);
            menuOptions();
        }

        System.out.println("Thank you!");
    }

    public static void menuOptions(){
        System.out.println("Press D to change the direction.");
        System.out.println("Press S to change the speed.");
        System.out.println("Press Q to quit the program." );
    }


}
