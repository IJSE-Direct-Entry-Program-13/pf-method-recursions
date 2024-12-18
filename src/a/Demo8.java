package a;

public class Demo8 {
    public static void main(String[] args) {
        printStarPattern(getNumberOfStars(5));
        //System.out.println(getNumberOfStars(5));
        //System.out.println(getRow(1));
    }

    static int getNumberOfStars(int rows) {
        return rows * (rows + 1) / 2;
    }

    static int getRow(int starCount) {
        return (int) Math.ceil(Math.abs((-1 + Math.sqrt(1 + 8 * starCount)) / 2));
    }

    static void printStarPattern(int star) {
        System.out.print("* ");
        if (getRow(star) != getRow(star - 1)) System.out.println();
        if (star == 1) return;
        printStarPattern(--star);
        System.out.print("* ");
        if (getRow(star + 1) != getRow(star + 2)) System.out.println();
    }
}
