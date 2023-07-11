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

//        this condition is used when you want to customize the box according to you
        SpriteBox vskp = new SpriteBox(10,20,10,25);
        System.out.println("the weigth of the box in pvp is  " + vskp.weight);
        System.out.println("the length of the box in pvp is " + vskp.length);

//        this condition is in rayagada where you want just se the prize of the box but the dimension
//        of the box is the default one

        SpriteCase rgdaCase = new SpriteCase(500);
        System.out.println("the price  of the case in rgda is  " + rgdaCase.cost);
        System.out.println("the height   of the case  in rgda is  " + rgdaCase.height);


//        this condition in for punjab where you want to customize the dimension , weight and cost of
//        case
        SpriteCase punjab = new SpriteCase();
    }
}
