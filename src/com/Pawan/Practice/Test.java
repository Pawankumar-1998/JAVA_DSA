package com.Pawan.Practice;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int i = 10;
//       Auto-Boxing --> Converting primitives into corresponding wrapper class
        Integer objI = i;

        System.out.println(i);
        System.out.println(objI);

//      Unboxing --> Converting Wrapper class into corresponding primitives
        int j = objI;
        System.out.println(j);

        int[] arr = { 1 , 2 , 3};
        Class p = arr.getClass();
        String name = p.getName();

        System.out.println(name);

        int[] a = { 1 , 2 , 3};

        int[] b = new int[3];

        System.arraycopy(a,0,b,0,2);
        System.out.println(Arrays.toString(b));

    }
}
