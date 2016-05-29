package ua.artcode05.week1;

import java.util.Scanner;

/**
 * Created by Programmer on 28/05/2016.
 */
public class fourFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = 0;

        if (num1 > num2) {
            res = num1 - num2;
        } else {
            if (num2 > num1) {
                res = num1 + num2;
            }
        }
        System.out.println("res: " + res);
    }
}
