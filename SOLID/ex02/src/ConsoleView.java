public class ConsoleView implements View {
    @Override
    public void playing(int bytes) {
        System.out.println("\u25B6 Playing " + bytes + " bytes");
    }

    @Override
    public void cacheStatus(boolean isCached) {
        System.out.println("Cached last frame? " + isCached);
    }
}
