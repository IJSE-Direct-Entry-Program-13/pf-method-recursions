package a;

public class Demo2 {
    public static void main(String[] args) {
        printStarPattern(4, 5);
    }

    static void printStarPattern(int rows,
                                 int cols) {
        if (cols == 0) {
            System.out.println();
            rows--;
            cols = 5;
        }
        if (rows == 0) {
            return;
        }
        System.out.print("* ");
        printStarPattern(rows, --cols);
    }
}
