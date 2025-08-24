public class OrderRepoImpl implements OrderRepo {
    @Override
    public void save(Order order) {
        System.out.println("Order stored (pretend DB).");
    }
}
