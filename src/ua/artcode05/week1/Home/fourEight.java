package ua.artcode05.week1.Home;

import java.util.Scanner;

/**
 * Created by Programmer on 28/05/2016.
 */
public class fourEight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please insert two numbers : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if ((num1 % 10) == (num2 % 10 )) {

            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
