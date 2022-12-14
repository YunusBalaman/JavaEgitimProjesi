package classTipleri;


public class Bebek implements Insan{

    public Bebek(){

    }

    @Override
    public void uyumak() {
        System.out.println("15 saat uyuyor");
    }

    @Override
    public void yemek() {
        System.out.println("Anne sütü içer");
    }

    @Override
    public void yurumek() {

        System.out.println("Şuanlık yürüyemiyorum");
    }

    @Override
    public void konusmak() {
        System.out.println("konuşamıyorum");
    }

    @Override
    public void dusunmek() {
        System.out.println("?");
    }

}
