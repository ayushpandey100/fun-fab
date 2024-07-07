package com.epam.tuesday;

public class Demo {
    static Random random;
    public void displayRecord(){
        random=new Random(23,"ayush");
        //System.out.println(random.id+" "+random.name);
    }
    public static void main(String[] args) {
        //System.out.println("ayush");
//        String firstName="ayush";
//        firstName=firstName+" pandey";
//        System.out.println(firstName);
        Demo demo=new Demo();
        demo.displayRecord();
        System.out.println(random.id+" "+random.name);
    }
    class Random{
        int id;
        String name;

        public Random(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }


}
