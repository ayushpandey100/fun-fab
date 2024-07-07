package com.epam.tuesday;

public class Earth {
    public static void main(String[] args) {
        String name="ayush";
        System.out.println("string array as args");
        Earth.main();
        Earth.main(name);
    }

    public static void main(String args) {
        System.out.println("string as args");
    }

    public static void main() {
        System.out.println("no parameter");
    }
}
