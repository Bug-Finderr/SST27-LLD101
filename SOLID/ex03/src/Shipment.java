public class Shipment {
    ShipmentType type;
    double weightKg;

    Shipment(ShipmentType type, double w) {
        this.type = type;
        this.weightKg = w;
    }

    public ShipmentType getType() {
        return type;
    }

    public double getWeightKg() {
        return weightKg;
    }
}