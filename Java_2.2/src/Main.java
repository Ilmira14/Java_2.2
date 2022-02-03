public class Main {
    public static void main(String[] args) {
        int account = 10;
        int refill = 901;
        int priceForRub = 100;

        boolean isParticipant = account + refill > 1000 ? true : false;
        int finalAccount = isParticipant ? refill / priceForRub + account + refill : account + refill;

        System.out.println("На вашем счете: " + finalAccount);
    }
}
