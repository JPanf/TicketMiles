public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        int ticketAmount = 12385;
        int mile = 20;
        int bonus;

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

                if (ticketAmount >= 0) {
                    bonus = ticketAmount / mile;
                } else {
                    bonus = 0;
                }

        System.out.println(bonus + " бонусных(ая) миль(я)");
    }
}
