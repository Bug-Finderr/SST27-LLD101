public class LastFrameCache implements Cache<Frame> {
    private Frame last;

    @Override
    public void save(Frame value) {
        this.last = value;
    }

    @Override
    public Frame last() {
        return last;
    }

    @Override
    public boolean hasLast() {
        return last != null;
    }
}
