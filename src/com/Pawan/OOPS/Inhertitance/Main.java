package com.Pawan.OOPS.Inhertitance;

import java.nio.file.Watchable;

public class Main {
    public static void main(String[] args) {
        Box square = new Box(4,2,8);
        Box rec = new Box(square);
        System.out.println(square.len + " " + square.width + " " + square.height);
        System.out.println(rec.len);

        Rectangle r = new Rectangle();
        System.out.println(r.len + " " + r.l);


        Watchable




    }
}
