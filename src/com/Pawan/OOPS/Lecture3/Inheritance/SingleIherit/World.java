package com.Pawan.OOPS.Lecture3.Inheritance.SingleIherit;

public class World {
    public static void main(String[] args) {

        SpriteCase newOne = new SpriteCase();

        System.out.println("length of the case is " + newOne.length);
        System.out.println("width of the case is " + newOne.width);
        System.out.println("height of the case is " + newOne.height);
        System.out.println("weight of the case is " + newOne.weight);
        System.out.println("cost of the case is " + newOne.cost);


//        this condition is for sprite box in rayagada
        SpriteBox rayagada = new SpriteBox(7,20);
        System.out.println("length of the spriteBox in rayagada is " + rayagada.length);
        System.out.println("weight of the sprite Box in rayagada is " + rayagada.weight);

//        this condition is for only setting the weight of the box
        SpriteBox pvp = new SpriteBox(23);
        System.out.println("the length of the box in pvp is " + pvp.length);
        System.out.println("the weigth of the box in pvp is  " + pvp.weight);
    }
}
