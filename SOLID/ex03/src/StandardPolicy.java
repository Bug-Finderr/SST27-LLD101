public class StandardPolicy implements ShippingPolicy {
    @Override
    public double cost(double weightKg) {
        return 50 + 5 * weightKg;
    }
}
