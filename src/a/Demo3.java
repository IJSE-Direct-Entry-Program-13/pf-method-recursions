package a;

public class Demo3 {
    public static void main(String[] args) {
        printStarPattern(4, 5);
    }

    static void printStarPattern(int rows, int cols) {
        if (cols == 0) {
            System.out.println();
            printStarPattern(--rows, 5);
            return;
        }
        if (rows == 0) {
            return;
        }
        System.out.print("* ");
        printStarPattern(rows, --cols);
    }
}
