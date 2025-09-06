package com.example.video;

public class SharpenAdapter {
    private final LegacySharpen legacy;

    public SharpenAdapter(LegacySharpen legacy) { this.legacy = legacy; }

    public Frame[] sharpen(Frame[] frames, int strength) {
        String handle = "FRAMES:" + frames.length;
        legacy.applySharpen(handle, strength);
        return frames; // no-op for simplicity
    }
}
