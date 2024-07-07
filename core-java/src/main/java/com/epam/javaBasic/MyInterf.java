package com.epam.javaBasic;

public interface MyInterf {
     String password="ayu@123";
     private void run(){
         System.out.println("running");
     }

    public static void main(String[] args) {
        System.out.println("werer");
    }


}
abstract class Galaxy{
     String star="moon";
}
class Earth extends Galaxy implements MyInterf{
    public static void main(String[] args) {
        MyInterf myInterf=new Earth();
        Galaxy galaxy=new Earth();
        System.out.println(myInterf.password);
        System.out.println(MyInterf.password);


        System.out.println(galaxy.star);
        //System.out.println(Galaxy.star);

    }


}
