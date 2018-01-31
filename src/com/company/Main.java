package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = 0;
        System.out.println(" В каком году была основана Одесса?");
        date = scanner.nextInt();
        if( date == 1794)
            System.out.println(" Вы правы!");
        else
            System.out.println("Вы ошиблись, Одесса была основана в 1794");

    }
}
