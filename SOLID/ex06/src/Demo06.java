public class Demo06 {
    public static void main(String[] args) {
        new Aviary().release(new FlyableBird());
        // new Aviary().release(new Penguin()); // compile time error now
        new Habitat().release(new Penguin());
    }
}
