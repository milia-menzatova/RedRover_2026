package lection;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        Задача №1
 Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш
 выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание,
 деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.
         */

        int a = 100;
        int b = 50;

        int c = 28;
        int d = 11;

        System.out.println("сложение " + (a + b));
        System.out.println( "умножение " + (a * b));
        System.out.println("вычитание " + (a - b));
        System.out.println("деление " + (a / b));
        System.out.println("остаток " + (a % b));

        if(c % 2 == 0){
            System.out.println("this is even number");
        }

        else{
            System.out.println("this is odd number");
        }
        if(d % 2 == 0){
            System.out.println("this is even number");
        }

        else{
            System.out.println("this is odd number");
        }







    }
}
