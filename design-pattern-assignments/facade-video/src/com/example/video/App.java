package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        VideoFacade facade = new VideoFacade();
        Path out = facade.process(Path.of("in.mp4"), Path.of("out.mp4"), true, 0.69, 4);
        System.out.println("Output at: " + out);
    }
}
