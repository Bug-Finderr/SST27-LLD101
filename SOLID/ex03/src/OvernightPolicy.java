public class OvernightPolicy implements ShippingPolicy {
    @Override
    public double cost(double weightKg) {
        return 120 + 10 * weightKg;
    }
}
