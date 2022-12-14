package classTipleri;

public class ConstructorDeneme {

    public double pi;
    private double r;

    public ConstructorDeneme(double r){

        if(r > 5 && r < 10){
            pi = 3d;
        }else {
           // pi = 3.14;
        }
        this.r = r;
    }

    public double cemberinAlani(){

        return pi * r * r;
    }
}
