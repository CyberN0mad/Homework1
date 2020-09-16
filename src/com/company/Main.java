package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String yourName;
        int num = 1;
        String word = " Baytur";
        yourName = num + word;

        System.out.println(yourName + num + word);

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {

            System.out.println("Вы сохранили нуль");
        }

        System.out.println("Введите Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }

}
