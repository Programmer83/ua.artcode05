package ua.artcode05.week2.Home;

import ua.artcode05.acutils.ArrayUtils;

import java.util.Scanner;

public class Seven_Four {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas1 = ArrayUtils.genArrRandom(size, range);

        String res1 = ArrayUtils.convertArr(mas1);
        System.out.println("Array before: " + res1);
        System.out.println("Input index of move: ");
        int move = sc.nextInt();

        int[] mas2 = ArrayUtils.moveArray(mas1, move);

        String res2 = ArrayUtils.convertArr(mas2);
        System.out.println(" Array after: " + res2);
        }
        }
