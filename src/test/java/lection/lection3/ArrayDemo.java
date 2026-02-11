package lection.lection3;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int a = 10;
        int[] array = {5, 4, 3};
        array[0] = 10;

        int[] massive = new int[4]; // create an array with four elements

        //System.out.println(array[0]);
        //System.out.println(array.length);

        for(int i = 0; i < array.length; i++){
           // System.out.println(array[i]);
            System.out.println("-------------------");
            System.out.println("Massive " + array[i] + 1);
        }
        System.out.println(Arrays.toString(array)); //To print array
    }


}
