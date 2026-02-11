package lection.lection3;

public class Task2 {
    public static void main(String[] args) {
        /*
        Задача №2
        Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным
        на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная
         */

        int a = 5;
        int b = 5;
        int sum = a + b;

        if(sum % 2 == 0){
            System.out.println("maybe a and b are even - если сумма переменных четная");
        } else {
            System.out.println("some variable is odd - если сумма переменных нечетная");
        }
    }
}
