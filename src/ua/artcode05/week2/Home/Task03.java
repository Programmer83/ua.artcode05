package ua.artcode05.week2.Home;

import ua.artcode05.acutils.ArrayUtils;

import java.util.Scanner;

/*3) Поменять местами наибольший и наименьший элементы в массиве*/

public class Task03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int size = sc.nextInt();
        System.out.print("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.genArrRandom(size, range);

        String res1 = ArrayUtils.convertArr(mas);
        System.out.println("Array before: " + res1);

        ArrayUtils.replaceMinMax(mas);

        String res2 = ArrayUtils.convertArr(mas);
        System.out.println("Array after: " + res2);
    }
}
