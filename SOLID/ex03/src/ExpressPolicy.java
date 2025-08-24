public class ExpressPolicy implements ShippingPolicy {
    @Override
    public double cost(double weightKg) {
        return 80 + 8 * weightKg;
    }
}
