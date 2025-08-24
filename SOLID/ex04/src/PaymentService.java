import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private Map<String, PaymentProcessor> processors;

    public PaymentService() {
        processors = new HashMap<>();
        processors.put("CARD", new CardProcessor());
        processors.put("UPI", new UpiProcessor());
        processors.put("WALLET", new WalletProcessor());
    }

    public PaymentService(Map<String, PaymentProcessor> processors) {
        this.processors = processors;
    }

    String pay(Payment p) {
        PaymentProcessor proc = processors.get(p.getProvider());
        if (proc == null) {
            throw new RuntimeException("No provider");
        }
        return proc.pay(p.getAmount());
    }
}