package a;

public class Demo4 {
    public static void main(String[] args) {
        printStarPattern(1);
    }

    static void printStarPattern(int star) {
        System.out.print("* ");
        if (star % 5 == 0) {
            System.out.println();
        }
        if (star == 20) return;
        printStarPattern(++star);
    }
}
