package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Izat","Programist","Google");
        System.out.println(programmer);
        programmer.Learn();
        programmer.Walk();
        programmer.Eat();
        programmer.coding();

        System.out.println("===========================================================");
        Danser danser = new Danser("Rayana","Biychi","Shoola");
        System.out.println(danser);
        danser.Learn();
        danser.Walk();
        danser.Eat();
        danser.dansing();
        System.out.println("===========================================================");

        Singer singer = new Singer("Usman","Yrchy","Rocfold");
        System.out.println(singer);
        singer.Learn();
        singer.Walk();
        singer.Eat();
        singer.playGitar();
        singer.singing();


    }

}
