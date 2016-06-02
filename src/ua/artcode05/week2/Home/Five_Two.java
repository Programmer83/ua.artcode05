package ua.artcode05.week2.Home;

import java.util.Scanner;

/**
 * Created by Programmer on 02/06/2016.
 */
public class Five_Two {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert factorial length : ");

        int num = sc.nextInt();

        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        System.out.println("Factorial is " +res);
    }
}
