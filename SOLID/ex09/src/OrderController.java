public class OrderController {
    private final OrderRepository orderRepo;

    public OrderController(OrderRepository repo) {
        this.orderRepo = repo;
    }

    void create(String id) {
        orderRepo.save(id);
        System.out.println("Created order: " + id);
    }
}