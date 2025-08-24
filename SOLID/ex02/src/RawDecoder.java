public class RawDecoder implements Decoder {
    @Override
    public Frame decode(byte[] bytes) {
        return new Frame(bytes);
    }
}
