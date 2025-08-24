public class FlatTax implements TaxPolicy {
    private final double taxRate;

    public FlatTax(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double total(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
