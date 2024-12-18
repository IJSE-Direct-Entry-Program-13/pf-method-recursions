package a;

public class Demo1 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            myMethod();
//        }

        myMethod(5);
    }

    static void myMethod(int x){
        System.out.println("Hello Recursions Up!");
        if (x == 1){
            System.out.println("Hello Recursions Down!");
            return;
        }
        myMethod(--x);
        System.out.println("Hello Recursions Down!");
    }
}
