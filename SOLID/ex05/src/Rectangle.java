public class Rectangle implements Shape {
    protected int w;
    protected int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    int getWidth() {
        return w;
    }

    void setWidth(int w) {
        this.w = w;
    }

    int getHeight() {
        return h;
    }

    void setHeight(int h) {
        this.h = h;
    }

    @Override
    public double area() {
        return (double) w * h;
    }
}