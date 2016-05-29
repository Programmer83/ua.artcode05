package ua.artcode05.week1;

import java.util.Scanner;

/**
 * Created by Programmer on 28/05/2016.
 */
public class fourTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 3 numbers: ");

        int max = 0;
        int min = 0;

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        min = max;
        if (num3 > max) {
            max = num3;
        }
        if (num1 < min) {
            min = num1;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("minimum number " + min);
        System.out.println("max number " + max);
    }
}


