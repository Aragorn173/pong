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
        checkcollision();
    }

    void checkcollision() {
        if (ball.y == 0 || ball.y == height) {
            ball.bounce();
        }
        if (ball.x == paddle.x && ball.y == paddle.y) {
            ball.bounce(paddle);
        }
        if (ball.x == paddle2.x && ball.y == paddle2.y) {
            ball.bounce(paddle2);
        }
    }
}
