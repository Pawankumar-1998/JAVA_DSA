package com.Pawan.OOPS.Lecture3.FInal;

import com.Pawan.OOPS.Lecture3.OverRiding.Child;

public class World {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        parent1.message();


       Childs childs1 = new Childs();
       childs1.message();

        Parent parent3 = new Childs();
       parent3.message();


    }
}
