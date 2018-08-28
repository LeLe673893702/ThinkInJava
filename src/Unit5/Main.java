package Unit5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Car car = new Car();
        car.initArrays("1","2","2");
    }



}

class Car {
    Integer[] integers ;
    final static char [] DigitOnes = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
    } ;
    public void initArrays(String... args) {

        System.out.println(args.getClass().toString());
        long q = 655536 / 100 ;
        System.out.println(q << 6 + q << 5 + q << 2);
        System.out.println((q << 6) + (q << 5) + (q << 2));
        // 72105655500
        // 10000 1100 1001 1101 0100 1111 1100 1100 1100
        // 1010 0000 0000 1000 1100
//        System.out.println(Integer.toString(655536 - (q << 6 + q << 5 + q << 2)));
        System.out.println(DigitOnes[36]);
        System.out.println(Long.toBinaryString(42949672965L).length());
        System.out.println(Long.toBinaryString(42949672965L));
        System.out.println(Integer.toString(429495));

    }

    private void f(Integer... args) {
        System.out.println("Integer");
    }

    private void f(Character... args) {
        System.out.println("Character");
    }

    private void f(Double... args) {
        System.out.println("Double");
    }
}
