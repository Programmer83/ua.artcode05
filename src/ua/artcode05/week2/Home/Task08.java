package ua.artcode05.week2.Home;

import ua.artcode05.acutils.ArrayUtils;

import java.util.Scanner;

/*8) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные*/

public class Task08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.genArrEvenRandomOnEvenIndex(size, range);

        String res = ArrayUtils.convertArr(mas);
        System.out.println("Array is: " + res);
    }
}
