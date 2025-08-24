public class Demo02 {
    public static void main(String[] args) {
        Player player = new Player(new RawDecoder(), new ConsoleView(), new LastFrameCache());
        player.play(new byte[] { 1, 2, 3, 4 });
    }
}
