//package com.Pawan.OOPS;
//// Animal class (base class)
//class Animal {
//    private String name;
//    private int age;
//
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void eat() {
//        System.out.println(name + " is eating.");
//    }
//
//    public void sleep() {
//        System.out.println(name + " is sleeping.");
//    }
//
//    public void makeSound() {
//        System.out.println(name + " makes a sound.");
//    }
//}
//
//// Dog class (subclass)
//class Dog extends Animal {
//    public Dog(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println(getName() + " barks.");
//    }
//
//    private void getName() {
//
//    }
//
//    public void fetch() {
//        System.out.println(getName() + " is fetching a ball.");
//    }
//}
//
//// Cat class (subclass)
//class Cat extends Animal {
//    public Cat(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println(getName() + " meows.");
//    }
//
//    public void scratch() {
//        System.out.println(getName() + " is scratching.");
//    }
//}
//
//// Bird class (subclass)
//class Bird extends Animal {
//    public Bird(String name, int age) {
//        super(name, age);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println(getName() + " chirps.");
//    }
//
//    public void fly() {
//        System.out.println(getName() + " is flying.");
//    }
//}
//
//public class AnimalDemo {
//    public static void main(String[] args) {
//        Dog dog = new Dog("Buddy", 3);
//        Cat cat = new Cat("Whiskers", 2);
//        Bird bird = new Bird("Polly", 1);
//
//        dog.eat();
//        dog.makeSound();
//        dog.fetch();
//
//        cat.eat();
//        cat.makeSound();
//        cat.scratch();
//
//        bird.eat();
//        bird.makeSound();
//        bird.fly();
//    }
//}
//
