public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 100;
        int priceForRub = 100;

        boolean isParticipant = account + refill > 1000 ? true : false;
        int finalAccount = isParticipant ? refill / priceForRub + account + refill : account + refill;
        int bonus = isParticipant ? refill / priceForRub : 0;
        System.out.println("На вашем счете: " + finalAccount);
        System.out.println("Количество начисленных бонусов: " + bonus);
    }
}
