package com.example.video;

import java.nio.file.Path;

public class VideoFacade {
    private final Decoder decoder = new Decoder();
    private final FilterEngine filter = new FilterEngine();
    private final Encoder encoder = new Encoder();
    private final SharpenAdapter sharpen = new SharpenAdapter(new LegacySharpen());

    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Frame[] frames = decoder.decode(src);
        if (gray) frames = filter.grayscale(frames);
        if (scale != null) frames = filter.scale(frames, scale);
        if (sharpenStrength != null) frames = sharpen.sharpen(frames, sharpenStrength);
        return encoder.encode(frames, out);
    }
}
