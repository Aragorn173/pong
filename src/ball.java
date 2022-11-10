public class ball {
    int x = 0;
    int y = 0;
    int vx = 1;
    int vy = 1;

    public ball(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    ball() {
        x = 10;
        y = 10;
    }

    void move() {
        x += vx;
        y += vy;
    }

    void bounce(paddle p) {
        vx = -vx;
    }

    void bounce() {
        vy = -vy;
    }

    @Override
    public String toString() {
        return "ball{" +
                "x=" + x +
                ", y=" + y +
                ", vx=" + vx +
                ", vy=" + vy +
                '}';
    }
}
