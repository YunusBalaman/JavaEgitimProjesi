package demo;

import demo2.Demo;

public class FirstClass {

    /**
     * benim main metodum
     * TODO: halen bunun üzerinde çalışıyorum
     * @param args afdfg
     */
    public static void main(String[] args) {

        System.out.println("Hello World");
        SecondClass secondClass = new SecondClass();

        /*
        System.out.println(SecondClass.pi);
        // SecondClass.pi = 3.149; pi sayısı
        System.out.println(SecondClass.pi);
         */

        int sonuc = secondClass.topla(5,6);
        secondClass.topla2(3.14, 3);
        System.out.println(sonuc);
        secondClass.carp(2,3);
        Demo demo = new Demo();
        demo.carp2(3,4);
        deneme();

        int bolSonuc = SecondClass.bol(4,2);
        System.out.println(bolSonuc);
    }

    public static void deneme(){

        System.out.println("static method");
    }

}
