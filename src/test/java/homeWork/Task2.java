package homeWork;

public class Task2 {
    public static void main(String[] args) {
        /*
        Задача №2
           Необходимо создать целочисленные переменные a и b, присвоить им произвольные
           значения, а потом поменять значения местами (значение переменной
          a должно оказаться в переменной b и наоборот).
       */
        int a = 80;
        int b = 90;
        int temp = a;
        a = b;
        b = temp;


        System.out.println(a);
        System.out.println(b);


    }
}
