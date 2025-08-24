public class UpiProcessor implements PaymentProcessor {
    @Override
    public String pay(double amount) {
        return "Paid via UPI: " + amount;
    }
}
