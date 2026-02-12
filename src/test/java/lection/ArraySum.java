package lection;

public class ArraySum {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 7};
        int sum = 0;

        for(int i = 0; i < array1.length; i++){
            sum = sum + array1[i];
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
