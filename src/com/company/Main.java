package com.company;

import javax.swing.*;
import java.time.LocalDate;
//a

public class Main {
    // Задание 1
    public static void leapYear(int leapYear) {

        if (((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 == 0))) {
            System.out.println("Год " + leapYear + " високосный");
        } else {
            System.out.println("Год " + leapYear + " не високосный");
        }
    }


    // Задание 2

    public static int clientOs(int clientDeviceYear, int clientOs) {

        if (clientOs > 0) {
        if (clientDeviceYear < 2022)
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    } else {
        if (clientOs <= 0)
        if (clientDeviceYear == 2022)
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    } return clientDeviceYear;
    }
    // Задание 3

    public static int deliveryTime(int deliveryDistance) {
    int deliveryDays = ((deliveryDistance - 20) / 40) + 1;
        if (deliveryDays <= 1) {
        System.out.println("Потребуется " + deliveryDays + " день ");
    }
        if (deliveryDays <= 4) {
        System.out.println("Потребуется " + deliveryDays + " дня ");
    }
        if (deliveryDays >= 5) {
        System.out.println("Потребуется " + deliveryDays + " дней ");
    } return deliveryDays;

    }
    // Задание 4

    public static void sort(String[] args) {
        String example = "aabccddefgghiijjkk";
        int exampleLength = example.length();
        System.out.println(exampleLength);
        for (int i = 0; i < exampleLength-1; i++ ) {
            if (example.charAt(i) == example.charAt(i+1))
                System.out.println(example.charAt(i));
        }
    }

    //Здесь хранятся значения для других методов, укажите в проверке, как создать 2 метод со (String[] args), так как
    // я не понял как это сделать, поэтому написан задание 5 внутри этого метода
    public static void main(String[] args) {
        leapYear(2027);
        clientOs(2019,1);
        deliveryTime(1932);


        // Задание 5


        int[] reverseMassive = {3, 2, 1, 6, 5};
        for (int i = reverseMassive.length - 1; i >= 0; i--) System.out.print(reverseMassive[i]);


    }






}


