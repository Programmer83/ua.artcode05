package ua.artcode05.week1;

import java.util.Scanner;

/**
 * Created by Programmer on 28/05/2016.
 */
public class fourFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert float number: ");
        double num = sc.nextDouble();

        if (num > 0 && num < 1) {
            System.out.println("inside");
        } else {
            System.out.println("not");
        }

    }
}
