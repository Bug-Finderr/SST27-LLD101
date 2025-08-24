public interface Cache<T> {
    void save(T item);

    T last();

    boolean hasLast();
}
