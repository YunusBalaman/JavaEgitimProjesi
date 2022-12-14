package inheritanceDemo;

public class MathMethods {

    public MathMethods(){

    }

    public int topla(int x, int y){

        return x+y;
    }

    private double topla(double x, double y){

        return x+y;
    }

    protected double topla(double x, double y, double z){

        return x+y+z;
    }

}
