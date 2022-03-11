package com.dio;

public class ExercicioOperadores {
    public static void main(String[] args) {
        
        System.out.println("PrePos");
        prePos();
        System.out.println("");
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("");
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("");
        System.out.println("Precedência");

        
    }

    private static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);

    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d = f;

        System.out.println("d: " + d);

    }
}
