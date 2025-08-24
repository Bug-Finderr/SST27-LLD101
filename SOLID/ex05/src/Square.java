
public class Square implements Shape {
    protected int side;

    public Square(int side) {
        this.side = side;
    }

    int getSide() {
        return side;
    }

    void setSide(int s) {
        this.side = s;
    }

    @Override
    public double area() {
        return (double) side * side;
    }
}