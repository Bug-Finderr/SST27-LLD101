public class Demo01 {
    public static void main(String[] args) {
        TaxPolicy tax = new FlatTax(0.18);
        Mailer mailer = new EmailClient();
        OrderRepo orderRepo = new OrderRepoImpl();

        OrderService orderService = new OrderService(tax, mailer, orderRepo);
        orderService.checkout("a@shop.com", 100.0);
    }
}