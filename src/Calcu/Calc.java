package Calcu;

import java.util.Scanner;

public class Calc {

    static int op;
    static Scanner scan = new Scanner(System.in);
    static String again = "";

    public static void main(String[] args) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        do {
            do {
                System.out.println("1 for Addition. 2 for Subtraction. 3 for Multiplication. 4 for Division");
                op = scan.nextInt();
            } while (op < 1 || op > 4);
            if (op == 1) {
                addition.calcAddition();
            }
            if (op == 2) {
                subtraction.calcSubtraction();
            }
            if (op == 3) {
                multiplication.calcMultiplication();
            }
            if (op == 4) {
                division.calcDivision();
            }
            scan.nextLine();
            System.out.println("Again? Y/N");
            again = scan.nextLine();
        }while(again.toUpperCase().equals("Y"));
    }
}