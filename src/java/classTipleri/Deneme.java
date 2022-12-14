package classTipleri;

public class Deneme {

    static Boolean boolean1;
    static boolean boolean2;
    static Integer integerSayi1;
    static int integerSayi2;
    public static void main(String[] args) {

        ConstructorDeneme constructorDeneme = new ConstructorDeneme(5);
        System.out.println(constructorDeneme.pi);
        System.out.println(constructorDeneme.cemberinAlani());
        ConstructorDeneme constructorDeneme2 = new ConstructorDeneme(6);
        System.out.println(constructorDeneme2.pi);
        System.out.println(constructorDeneme2.cemberinAlani());


        System.out.println(boolean1);
        System.out.println(boolean2);
        System.out.println(integerSayi1);
        System.out.println(integerSayi2);
    }
}
