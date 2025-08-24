public class WalletProcessor implements PaymentProcessor {
    @Override
    public String pay(double amount) {
        return "Wallet debit: " + amount;
    }
}
