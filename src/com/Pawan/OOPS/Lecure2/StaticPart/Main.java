package com.Pawan.OOPS.Lecure2.StaticPart;

public class Main {
    public static void main(String[] args) {
        Human pawan = new Human(23,"Pawan KUmar",45000,false);
        Human dinesh = new Human(23,"Dinesh Takiri",65000,true);
        System.out.println(Human.population);
        Main obj = new Main();
        obj.greeting();
        funMessage();
    }

    static void funMessage(){
        System.out.println("this is a fun message ");
    }
    void greeting(){
        System.out.println("hii hello namesta ");
        funMessage();
    }
}
