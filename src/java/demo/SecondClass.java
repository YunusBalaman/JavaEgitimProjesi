package demo;

public class SecondClass {

    public static final double pi = 3.14;
    public void deneme(){

        System.out.println(pi);
        short shortSayi1 = 2147;
        Integer integerSayi1 = 2147483647;
        int integerSayi2 = -2147483648;
        Long longSayi1 = 2147483648L;
        long longSayi2 = 2147483649L;
        float floatSayi1 = 2.14f;
        double doubleSayi2 = 2.144;
        String a = "Yunus";
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        byte byteValue1 = -128;
        byte byteValue2 = 127;
        char charValue = 'a';
    }

    public int topla(int x, int y){

        return x + y;
    }

    private double topla(double x, double y){

        return x + y;
    }

    double topla2(double x, double y){

        return topla(x,y);
    }

    protected int carp(int x, int y){

        return x * y;
    }

    public static int bol(int x, int y){

        return x / y;
    }
}
