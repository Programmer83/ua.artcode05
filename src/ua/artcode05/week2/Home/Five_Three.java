package ua.artcode05.week2.Home;

/**
 * Created by Programmer on 28/05/2016.
 */
public class Five_Three {

    public static void main(String[] args) {

        int[] myNum = {5,6,7,8};

        int res = 0;

        for (int i = 0 ; i < myNum.length; i++){
            if (myNum[i] == 8) {
                res++;
            }
        }

        System.out.println("res = " + res);
    }
}
