package ua.artcode05.week2.Home;

import java.util.Scanner;

public class Five_Four {

    public static void main(String[] args) {

        System.out.print("Please insert range of : ");
        Scanner sc1 = new Scanner(System.in);
        int range = sc1.nextInt();
        System.out.print("Please insert position number less then range: ");
        Scanner sc2 = new Scanner(System.in);
        int npos = sc2.nextInt();

        int[] feb = new int[range];

        feb[0] = 0;
        feb[1] = 1;

        for (int i = 2; i < range; i++) {
            feb[i] = feb[i - 1] + feb[i - 2];
        }
        System.out.print(feb[npos]);
    }
}
