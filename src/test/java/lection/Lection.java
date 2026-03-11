package lection;

public class Lection {
    public static void main(String[] args) {
        int[] boxes = {59, 60, 63, 55, 60, 61, 63};
        int sum = 0;
        //int max = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < boxes.length; i++){
            //sum = sum + boxes[i];
            if(boxes[i] > max){
                max = boxes[i];
            }
        int[][] step = {
                {3030, 2500, 1000}, //first element of array
                {3500, 3200}, // 2
                {2342, 3434, 5879, 4354}// 3
        };

       int sum1 = 0;
            for (int a = 0; a < step.length; a++) {
                int[] day = step[i];
                for (int j = 0; j < day.length; j++) {
                    sum1 += day[j];

                }
                System.out.println("Array" + sum1);
            }




        }
        //System.out.println(max);
    }
}
