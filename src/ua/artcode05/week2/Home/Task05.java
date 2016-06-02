package ua.artcode05.week2.Home;

import ua.artcode05.acutils.ArrayUtils;

import java.util.Scanner;


/*5) Посчитать сколько цифр(цифра задается пользователем) в массиве*/

public class Task05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.genArrRandom(size, range);

        String res1 = ArrayUtils.convertArr(mas);
        System.out.println("Array is: " + res1);

        System.out.println("Input number from array: ");
        int number = sc.nextInt();

        int count = ArrayUtils.countNumInArr(number, mas);

        System.out.println("Number " + number + " occurs " + count + " times in the array");

    }
}
