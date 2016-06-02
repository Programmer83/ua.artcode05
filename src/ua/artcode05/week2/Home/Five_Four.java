package ua.artcode05.week2.Home;

import java.util.Scanner;

public class Five_Four {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Please insert range of : ");
        System.out.print("Please insert position number of : ");

        int range = sc1.nextInt();
        int npos = sc2.nextInt();

        int[] feb = new int[range];

        feb[0] = 0;
        feb[1] = 1;

        for(int i = 2; i < range; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }
            System.out.print(feb[npos]);
        }
   }
}