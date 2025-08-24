import java.util.EnumMap;
import java.util.Map;

public class ShippingCostCalculator {
    private final Map<ShipmentType, ShippingPolicy> policies;

    public ShippingCostCalculator() {
        policies = new EnumMap<>(ShipmentType.class);
        policies.put(ShipmentType.STANDARD, new StandardPolicy());
        policies.put(ShipmentType.EXPRESS, new ExpressPolicy());
        policies.put(ShipmentType.OVERNIGHT, new OvernightPolicy());
    }

    public ShippingCostCalculator(Map<ShipmentType, ShippingPolicy> policies) {
        this.policies = policies;
    }

    double cost(Shipment s) {
        ShippingPolicy policy = policies.get(s.getType());
        if (policy == null) {
            throw new IllegalArgumentException("Unknown type: " + s.getType());
        }
        return policy.cost(s.getWeightKg());
    }
}
