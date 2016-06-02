package ua.artcode05.week2.Home;

import ua.artcode05.acutils.ArrayUtils;

import java.util.Scanner;

/*2) Найти среднее арифметическое массива*/

public class Task02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int size = sc.nextInt();
        System.out.print("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.genArrRandom(size, range);
        int average = ArrayUtils.findAverageOfArr(mas);

        String res = ArrayUtils.convertArr(mas);
        System.out.println("Array is: " + res);
        System.out.println("Average of array is: " + average);
    }
}
