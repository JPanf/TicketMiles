public class Main {
    public static void main(String[] args) {

        int ticketAmount = 12385;
        int mile = 20;
        int bonus;

        if (ticketAmount >= 0) {
            bonus = ticketAmount / mile;
        } else {
            bonus = 0;
        }

        System.out.println(bonus + " бонусных(ая) миль(я)");
    }
}
