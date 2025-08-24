public class Demo07 {
    public static void main(String[] args) {
        Printer p = new BasicPrinter();
        p.print("Hello");

        ModernPrinter m = new OfficeMFP();
        m.print("Hello");
        m.scan("/tmp/out");
        m.fax("123456789");
    }
}
