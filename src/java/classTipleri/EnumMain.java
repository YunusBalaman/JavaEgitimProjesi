package classTipleri;

public class EnumMain {

    public static void main(String[] args) {

        cinsiyet(Cinsiyet.KADIN);
        cinsiyet(Cinsiyet.ERKEK);
        EnumClass.INSTANCE.deneme();
    }

    public static void cinsiyet(Cinsiyet cinsiyet){

        System.out.println(cinsiyet.name());
    }
}
