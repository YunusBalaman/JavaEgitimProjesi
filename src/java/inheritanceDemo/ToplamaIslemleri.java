package inheritanceDemo;

import classTipleri.EnumClass;

public class ToplamaIslemleri {

    /**
     new short public private super protected class package int double char
     long abstract
     */

    public static void main(String[] args) {

       // EnumClass.INSTANCE.deneme();
        MathMethods mathMethods = new MathMethods();
        mathMethods.topla(2,3);
        mathMethods.topla(2,3,4);
    }
}
