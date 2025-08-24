public class Payment {
    private final String provider;
    private final double amount;

    Payment(String p, double a) {
        provider = p;
        amount = a;
    }

    public String getProvider() {
        return provider;
    }

    public double getAmount() {
        return amount;
    }
}