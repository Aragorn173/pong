public class test2 {
    public static void main(String[] args) {
        paddle p = new paddle();
        ball boll = new ball();

        boll.move();
        boll.bounce();
        boll.move();
        boll.move();
        boll.bounce(p);
        boll.move();
        boll.move();
        boll.bounce();
        boll.move();
        boll.move();
        boll.move();
        boll.bounce(p);
        boll.move();
        boll.move();
    }
}
