public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1001;
        int priceForRub = 100;

        boolean isParticipant = refill > 1000 ? true : false;
        int bonus = isParticipant ? refill / priceForRub : 0;
        int finalAccount = account + bonus + refill;
        System.out.println("На вашем счете: " + finalAccount);
        System.out.println("Количество начисленных бонусов: " + bonus);
    }
}
