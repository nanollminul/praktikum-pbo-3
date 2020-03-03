package BangunDatar;

public class Kubus extends Persegi {

    @Override
    public double getSisi(){
        return sisi;
    }
    @Override
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double volume(){
        return (float) (Math.pow(this.sisi, 3));
    }
}
