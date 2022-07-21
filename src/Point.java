import java.util.Objects;

public  class Point extends TextBox {
    private int y;
    private int x;

//    public Point(int y, int x) {
//        this.y = y;
//        this.x = x;
//    }

    @Override
    public void render() {
        System.out.println("this is point class");
    }

    @Override
    public String toString() {
        return "Point{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }

    @Override
    public void addText(String text) {
        super.addText(text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return y == point.y && x == point.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }
}
