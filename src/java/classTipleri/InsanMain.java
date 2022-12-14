package classTipleri;

public class InsanMain {

    public static void main(String[] args) {


        Bebek bebek = new Bebek();
        bebek.dusunmek();
        bebek.konusmak();
        bebek.uyumak();
        bebek.yemek();
        bebek.yurumek();
        Insan insan = new Bebek();
        insan.dusunmek();
        insan.konusmak();
        insan.uyumak();
        insan.yemek();
        insan.yurumek();

        Yetiskin yetiskin = new Yetiskin();
        yetiskin.dusunmek();
        yetiskin.konusmak();
        yetiskin.uyumak();
        yetiskin.yemek();
        yetiskin.yurumek();
        yetiskin.calismak(Mevsimler.YAZ);
        Insan yetiskinInsan = new Yetiskin();
        yetiskinInsan.dusunmek();
        yetiskinInsan.konusmak();
        yetiskinInsan.uyumak();
        yetiskinInsan.yemek();
        yetiskinInsan.yurumek();

        Yetiskin yetiskin1 = getYetiskin();

    }

    public static Yetiskin getYetiskin(){

        return new Yetiskin();
    }
}
