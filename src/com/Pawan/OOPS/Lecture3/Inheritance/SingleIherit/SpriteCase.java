package com.Pawan.OOPS.Lecture3.Inheritance.SingleIherit;

public class SpriteCase extends SpriteBox {
    int cost;

    SpriteCase(){
        super();
        this.cost = -1;
    }

    SpriteCase(int cost){
        this.cost = cost;
    }
}
