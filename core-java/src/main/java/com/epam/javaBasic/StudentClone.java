package com.epam.javaBasic;

public class StudentClone implements Cloneable {
    int roll;
    String name;

    public StudentClone(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {

        try{
            StudentClone s1=new StudentClone(1,"ayush");
            StudentClone s2=(StudentClone) s1.clone();
            System.out.println("Student s1 "+s1.name+" "+s1.roll);
            System.out.println("Student s2 "+s2.name+" "+s2.roll);
        }
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }

    }

}
