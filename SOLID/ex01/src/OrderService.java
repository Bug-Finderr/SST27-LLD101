public class OrderService {
    private final TaxPolicy tax;
    private final Mailer mailer;
    private final OrderRepo orderRepo;

    public OrderService(TaxPolicy tax, Mailer mailer, OrderRepo orderRepo) {
        this.tax = tax;
        this.mailer = mailer;
        this.orderRepo = orderRepo;
    }

    public double totalWithTax(double subtotal) {
        return tax.total(subtotal);
    }

    void checkout(String customerEmail, double subtotal) {
        double total = totalWithTax(subtotal);
        mailer.send(customerEmail, "Thanks! Your total is " + total);
        orderRepo.save(new Order(customerEmail, subtotal, total));
    }
}