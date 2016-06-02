package ua.artcode05.acutils;

import java.util.Scanner;

public class ArrayUtils {

    /*Создание массива и заполнение случайными числами*/
    public static int[] genArrRandom(int size, int range) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * range);
        }
        return mas;
    }

    /*Конвертация массива*/
    public static String convertArr(int[] mas) {
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + ", ";
        }
        return res;
    }

    /*Вывод массива на консоль*/
    public static void printArr(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
    }

    /*1) найти минимальное и максимальное значения в массиве и вывести их на консоль*/

    public static void findMinAndMax(int[] mas) {

        int minIndex = ArrayUtils.findMinIndex(mas);
        int maxIndex = ArrayUtils.findMaxIndex(mas);

        String str = ArrayUtils.convertArr(mas);
        System.out.println("Array is: " + str);
        System.out.println("Max number is: " + maxIndex + "\nMin number is: " + minIndex);
    }

    public static int findMinIndex(int[] mas) {

        int minIndex = mas[0];

        for (int i = 0; i < mas.length; i++) {
            minIndex = Math.min(minIndex, mas[i]);
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] mas) {

        int maxIndex = mas[0];

        for (int i = 0; i < mas.length; i++) {
            maxIndex = Math.max(maxIndex, mas[i]);
        }
        return maxIndex;
    }



    /*3) Поменять местами наибольший и наименьший элементы в массиве*/

    public static int[] replaceMinMax(int[] mas) {

        int maxIndex = ArrayUtils.findMaxIndex(mas);
        int minIndex = ArrayUtils.findMinIndex(mas);
        int iMax = 0;
        int iMin = 0;

        for (int i = 0; i < mas.length; i++) {
            if (maxIndex == mas[i]) {
                iMax = i;
            }
            if (minIndex == mas[i]) {
                iMin = i;
            }
        }
        mas[iMax] = minIndex;
        mas[iMin] = maxIndex;

        return mas;
    }


    /*2) Найти среднее арифметическое массива*/

    public static int findAverageOfArr(int[] mas) {

        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }

        return (sum / mas.length);
    }


    /*9) Задать два массива случайными числами от 25 до 75.
    Определить у какого из массивов больше парных елементов.*/

    public static boolean sameElemInArr(int size1, int size2) {

        int[] mas1 = new int[size1];
        int[] mas2 = new int[size2];
        int even1 = 0;
        int even2 = 0;

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 50) + 25;
            if (mas1[i] % 2 == 0) {
                even1++;
            }
        }
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 50) + 25;
            if (mas2[i] % 2 == 0) {
                even2++;
            }
        }

        System.out.print("\nArray1 is: ");
        ArrayUtils.printArr(mas1);
        System.out.print("\nArray2 is: ");
        ArrayUtils.printArr(mas2);

        boolean res = even1 > even2;
        System.out.println("\n\nArray1 has more even numbers than array2?\n" + res);

        return res;
    }


    /*8) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные*/

    public static int[] genArrEvenRandomOnEvenIndex(int size, int range) {

        int[] mas = new int[size];
        int random = 0;

        for (int i = 0; i < mas.length; i++) {
            random = (int) (Math.random() * range);
            if (i == 0 || i %2 == 0) {
                mas[i] = random %2 == 0 ? random : random + 1;
            } else {
                mas[i] = random %2 != 0 ? random : random + 1;
            }
        }
        return mas;
    }

    /*5) Посчитать сколько цифр(цифра задается пользователем) в массиве*/

    public static int countNumInArr(int number, int[] mas) {

        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == number) {
                count++;
            }
        }

        return count;
    }


}