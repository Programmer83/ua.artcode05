package ua.artcode05.week1.Home;

import java.util.Scanner;

/**
 * Created by Programmer on 28/05/2016.
 */
public class fourThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input number: ");
        int num = sc.nextInt();

        int res = num % 7;

        if (res == 0) {
            res = num * 2;
            System.out.println(res);
        } else {
            System.out.println("Wrong number");
        }
    }
}
