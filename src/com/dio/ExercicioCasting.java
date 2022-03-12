package com.dio;

public class ExercicioCasting {
    
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 1000000000000000L;
        i2 = (int) l2;

        double d1;
        float f1 = 10.5F;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58D;
        double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888888888888888888888888888D;
        f2 = (float) d2;
        f3 = (float) d3;

        int i3;
        float f4 = 11.5679837F;
        i3 = (int) f4;

        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);
        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("f4: " + f4);
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);
     
    }
}
