public class Demo08 {
    public static void main(String[] args) {
        Pedalable p = new Bicycle();
        p.pedal(6);

        Hybrid h = new Car();
        h.startEngine();
        h.recharge(2);
    }
}
