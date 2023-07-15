package com.Pawan.OOPS.Lecture3.OverRiding;

public class World {
    public static void main(String[] args) {
        Parent father = new Parent();

        Child son = new Child();

        son.message();
        father.message();

        Parent father2 = new Child();
        father2.message();

//        let's print the object only
        System.out.println(father2);



    }
}
