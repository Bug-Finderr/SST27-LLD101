public class Player {
    private final Decoder decoder;
    private final View view;
    private final Cache<Frame> cache;

    public Player(Decoder decoder, View view, Cache<Frame> cache) {
        this.decoder = decoder;
        this.view = view;
        this.cache = cache;
    }

    public void play(byte[] fileBytes) {
        // decode
        Frame f = decoder.decode(fileBytes);
        cache.save(f);
        // draw UI
        view.playing(fileBytes.length);
        // cache
        view.cacheStatus(cache.hasLast());
    }
}