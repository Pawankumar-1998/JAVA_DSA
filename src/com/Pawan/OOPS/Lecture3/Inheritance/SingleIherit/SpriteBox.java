package com.Pawan.OOPS.Lecture3.Inheritance.SingleIherit;

public class SpriteBox extends Box{
    int weight;

    SpriteBox(){
        super();
        this.weight = -1;
    }

//    use this constructor if you want set the dimension of the box and weight of the box
    SpriteBox(int dimens , int weight){
        super(dimens);
        this.weight = weight;
    }

    SpriteBox(int weight){
        this.weight = weight;
    }

    public void message(){
        System.out.println("this message is from SpriteBox");
    }
}
