package ua.artcode05.week1.Home;

import java.util.Scanner;

/**
 * Created by Programmer on 28/05/2016.
 */
public class fourSeven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int num1 = sc.nextInt();

        System.out.print("Enter second number");
        int num2 = sc.nextInt();

        double res = num1/num2;

        if (num1 % num2 == 0) {
            System.out.println("true " + res);
        } else {
            System.out.println("false " + res);
        }
    }
}
