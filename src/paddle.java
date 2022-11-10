public class paddle {
    int x = 0;
    int y = 0;
    int width = 10;


    paddle() {
        x = 0;
        y = 0;
        width = 10;
    }

    public paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "paddle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                '}';
    }

    void moveUp() {
        y = y- 1;
    }

    void moveDown() {
        y = y +1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public paddle(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }
}
