package a;

public class Demo6 {
    public static void main(String[] args) {
        printStarPattern(1);
    }

    static int cols = 5;

    static void printStarPattern(int star) {
        System.out.print("* ");
        if (star % cols == 0) {
            cols--;
            star = 0;
            System.out.println();
        }
        if (cols == 0) return;
        printStarPattern(++star);
    }
}
