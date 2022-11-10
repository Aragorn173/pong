public class test {
    public static void main(String[] args) {

        paddle one = new paddle();
        System.out.println(one);
        one.moveUp();
        System.out.println(one.getY());
        one.moveDown();
        System.out.println(one.getY());
    }
}
