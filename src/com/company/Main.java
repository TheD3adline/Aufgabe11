package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numHigh, numLow, num, function, loop;
        boolean reset = true;
        boolean step = true;
        Scanner sc = new Scanner(System.in);

        do {
            numHigh = 1000;
            num = 500;
            numLow = 1;
            System.out.println("Dieses Spiel soll eine Zahl festellen die der Benutzer sich denkt");
            System.out.println("Denken Sie bitte an eine Zahl zwischen " + numLow + " und " + numHigh);
            do {
                System.out.println("Ist Ihre Zahl die " + num + " oder ist Ihre Zahl groesser (>) oder kleiner (<) als " + num + " ?");
                System.out.println("Meine Zahl ist... ");
                System.out.println("...tatsaechlich die " + num + ", 1 druecken!");
                System.out.println("...kleiner (<) als " + num + ", 2 druecken!");
                System.out.println("...groesser (>) als " + num + ", 3 druecken!");
                function = sc.nextInt();
                switch (function) {
                    case 1:
                        System.out.println("Ich habe es geschafft Ihre Zahl, " + num + " zu finden!");
                        System.out.println("Wollen Sie noch einmal spielen?");
                        System.out.println("1. JA (RESET)");
                        System.out.println("0. NEIN (EXIT)");
                        loop = sc.nextInt();
                        if (loop == 0) {
                            reset = false;
                            System.out.println("Programm wird beendet!");
                        } else if (loop == 1) {
                            reset = true;
                            System.out.println("NEUSTART!");
                            numHigh = 1000;
                            num = 500;
                            numLow = 1;
                        } else {
                            System.out.println("ERROR: Falsche Eingabe, Programm abgebrochen!");
                            reset = false;
                        }
                        break;
                    case 2:
                        lower(num, numHigh, numLow);
                        break;
                    case 3:


                        break;
                    default:
                        System.out.println("Error: Falsche Eingabe, Programm abgebrochen!");
                        step = false;
                        reset = false;
                }

            } while(step);

        } while(reset);

    }

    public static void lower(int num, int numHigh, int numLow) {



    }

}
