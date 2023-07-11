package com.Pawan.OOPS.Lecture3.Practice;

public class World {
    public static void main(String[] args) {

//        creating the object of pawans parent and using the default constructor
        Parents pawansParent = new Parents();
        System.out.println(pawansParent.money);
        System.out.println(pawansParent.vehicle);
        pawansParent.message();

//      creating the object of dinesh parent and using the parametazed constructor
        Parents dineshParent = new Parents(15000,45,1,"dinesh");
        System.out.println(dineshParent.money);
        System.out.println(dineshParent.vehicle);
        dineshParent.message();



//        creating the object of the child class
        Children pawan = new Children();
        System.out.println(pawan.age);
        System.out.println(pawan.money);
        System.out.println(pawan.standard);


//        Children sai = new Parents(); --> this cannot be done because a child class cannot refer to parent object

        Parents newParent = new Children();
        newParent.message();
    }
}
