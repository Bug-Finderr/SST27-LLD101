public class Frame {
    private final byte[] data;

    public Frame(byte[] d) {
        this.data = d;
    }

    public int length() {
        return data.length;
    }

    public byte[] getData() {
        return data;
    }
}
