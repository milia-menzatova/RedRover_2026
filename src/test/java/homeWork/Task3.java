package homeWork;

public class Task3 {
    public static void main(String[] args) {

        /*
        Задача №3

Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу
корабля, половина оставшегося — капитану, остальное делится поровну между всеми членами команды,
 включая капитана.

Размер добычи (например, в дублонах) и количество пиратов на корабле задать переменными.

Вывести на экран кому сколько дублонов полагается
Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

         */

        double teamSize = 10;
        double money = 900;

        double teamMemberShare = (money / 2) / 10;
        double ownerShare = money / 2;
        double capitanShare = ownerShare + teamMemberShare;

        System.out.println("Each team member share: " + teamMemberShare);
        System.out.println("Owner share: " + ownerShare);
        System.out.println("Capitan share: " + capitanShare);

    }
}
