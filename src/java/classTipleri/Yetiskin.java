package classTipleri;

public class Yetiskin implements Insan, Mevsimler{
    @Override
    public void uyumak() {

        System.out.println("7 saat uyku");
    }

    @Override
    public void yemek() {

        System.out.println("Her yemeği yiyebiliyor");
    }

    @Override
    public void yurumek() {

        System.out.println("yürüyebiliyor");
    }

    @Override
    public void konusmak() {

        System.out.println("konuşabiliyor");
    }

    @Override
    public void dusunmek() {

        System.out.println("Sürekli düşünüyorum");
    }

    public void calismak(String mevsim){

        switch (mevsim){

            case KIS:
                System.out.println("Günde 8 saat çalışıyorum");
                break;
            case YAZ:
                System.out.println("Günde 12 saat çalışıyorum");
                break;
            case SON_BAHAR:
            case ILK_BAHAR:
                System.out.println("Günde 9 saat çalışıyorum");
                break;
        }

    }
}
