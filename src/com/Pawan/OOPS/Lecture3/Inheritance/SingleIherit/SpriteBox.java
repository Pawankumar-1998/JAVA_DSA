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
//  this is used to set only the weight of the box
    SpriteBox(int weight){
        this.weight = weight;
    }

//    this constructor is used to set the custom dimension and the weight of the box
    SpriteBox(int length , int width , int height , int weight){
        super(length,width,height);
        this.weight = weight;
    }

    public void message(){
        System.out.println("this message is from SpriteBox");
    }
}
