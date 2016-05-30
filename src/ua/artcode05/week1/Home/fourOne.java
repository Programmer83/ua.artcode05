package ua.artcode05.week1.Home;

import java.util.Scanner;

/**
 * Created by Programmer on 28/05/2016.
 */
public class fourOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input time from 0 to 24: ");
        byte time = sc.nextByte();

        if(time >= 9 && time <= 18) {
            System.out.println("I am at work");
        } else { System.out.println("Relaxing");
        }
    }
}
