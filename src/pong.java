public class pong {
    ball ball = new ball();
    paddle paddle = new paddle(-10, 0);
    paddle paddle2 = new paddle(10, 0);
    int width;
    int height;


    void pong(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void update() {
        ball.move();
    }

    void checkcollision() {

    }
}
