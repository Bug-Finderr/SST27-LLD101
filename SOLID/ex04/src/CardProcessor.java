public class CardProcessor implements PaymentProcessor {
    @Override
    public String pay(double amount) {
        return "Charged card: " + amount;
    }
}
