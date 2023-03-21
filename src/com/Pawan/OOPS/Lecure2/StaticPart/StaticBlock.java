package com.Pawan.OOPS.Lecure2.StaticPart;

public class StaticBlock {
    static int a=5;
    static int b;
    static {
        System.out.println("i am the static block ");
        b = a * 4;
    }

    public static void main(String[] args) {
//        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
