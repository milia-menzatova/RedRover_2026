package lection.lection3;

public class ArrayDemo {
    public static void main(String[] args) {
        int a = 10;
        int[] array = {5, 4, 3};

        array[0] = 10;

        //System.out.println(array[0]);
        //System.out.println(array.length);

        for(int i = 0; i < array.length; i = i +1){
            System.out.println(array[i]);

        }
    }


}
