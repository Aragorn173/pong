public class test2 {
    public static void main(String[] args) {
        paddle p = new paddle();

        ball boll = new ball();
        System.out.println(boll);
        boll.move();
        System.out.println(boll);
        boll.bounce();
        boll.move();
        System.out.println(boll);
        boll.bounce(p);
        boll.move();
        System.out.println(boll);
    }
}
