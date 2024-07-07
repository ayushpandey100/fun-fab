package com.epam.javaBasic;

public abstract class Animal {
    String name="ayush";
    abstract public void run();
    public void fun() {
        System.out.println("swimming");
    }

    public static void main(String[] args) {
        System.out.println("hello...");
//        Animal a=new Test();
//        a.run();
        Animal animal =new Test();
        animal.fun();
        animal.run();
        System.out.println(animal.name);
    }
}
 class Test extends Animal{
    public void run(){
        System.out.println("running");
    }
}

