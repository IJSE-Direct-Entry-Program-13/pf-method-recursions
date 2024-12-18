package a;

public class Demo6 {
    public static void main(String[] args) {
        printStarPattern(1);
    }

    static int printStarPattern(int star) {
        System.out.print("* ");
        if (star % 5 == 0) {
            System.out.println();
            return --star;
        }
        printStarPattern(++star);
    }
}
