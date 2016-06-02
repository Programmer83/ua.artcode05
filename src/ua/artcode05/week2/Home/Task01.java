package ua.artcode05.week2.Home;

import ua.artcode05.acutils.ArrayUtils;

import java.util.Scanner;

/*1) Найти минимальное и максимальное значения в массиве и вывести их на консоль*/

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int size = sc.nextInt();
        System.out.print("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.genArrRandom(size, range);

        ArrayUtils.findMinAndMax(mas);
    }
}
