package ua.artcode05.week2.Home;


import artcodeUtils.ArrayUtils;

import java.util.Scanner;

/*1) найти минимальное и максимальное значения в массиве и вывести их на консоль*/

public class Week2Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMasRandom(size, range);

        ArrayUtils.findMinAndMax(mas);
    }
}
