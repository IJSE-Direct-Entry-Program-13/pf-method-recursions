package a;

import java.util.Random;

public class Demo7 {

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20));

        System.out.println("-----------------");

        System.out.println(sum(10,20));
        System.out.println(sum(10,20));

        System.out.println("-----------------");

        System.out.println(getValue(10));
        System.out.println(getValue(10));
        System.out.println(getValue(10));
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int value = 0;

    static int sum(int num1, int num2){
        return value + (value = (num1 + num2));
    }

    static int getValue(int num){
        return num * new Random().nextInt();
    }
}
