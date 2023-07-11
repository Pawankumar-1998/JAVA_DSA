package com.Pawan.OOPS.Lecture3.Inheritance.SingleIherit;

public class SpriteCase extends SpriteBox {
    int cost;

    //    this is when the sprite case is created
    SpriteCase() {
        super();
        this.cost = -1;
    }

    //    this is when you want to set only the price of the case
    SpriteCase(int cost) {
        this.cost = cost;
    }

    //    this is used when you want to set weight and cost of the box
    SpriteCase(int weight, int cost) {
        super(weight);
        this.cost = cost;
    };



//    this condition is used when you want cusomized dimension , weight and cost of the box

}
