package BangunDatar;

// Polymafishm
public class Main {
    public static void main(String[] args){

        // PERSEGI
        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        System.out.println("==============================================================");
        System.out.println("\t\t\t\tPERSEGI");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Sisi\t\t: " + persegi.getSisi());
        System.out.println("Luas\t\t: " + persegi.Luas());
        //System.out.println("Luas Persegi : " + persegi.Luas(10)); // override
        System.out.println("Keliling\t: " + persegi.Keliling());
        System.out.println("==============================================================");

        // LINGKARAN
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(7);
        System.out.println("\t\t\t\tLINGKARAN");
        System.out.println("--------------------------------------------------------------");
        System.out.println("r\t\t\t: " + lingkaran.getR());
        System.out.println("Luas\t\t: " + lingkaran.Luas());
        System.out.println("Keliling\t: " + lingkaran.Keliling());
        System.out.println("==============================================================");

        // PERSEGI PANJANG
        PersegiPanjang PP = new PersegiPanjang();
        PP.setLebar(10);
        PP.setPanjang(20);
        System.out.println("\t\t\t\tPERSEGI PANJANG");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Lebar\t\t: " + PP.getLebar());
        System.out.println("Panjang\t\t: " + PP.getPanjang());
        System.out.println("Luas\t\t: " + PP.Luas());
        System.out.println("Keliling\t: " + PP.Keliling());
        System.out.println("==============================================================");

        // SEGITIGA
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(10);
        segitiga.setTinggi(10);
        System.out.println("\t\t\t\tSEGITIGA");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Alas\t\t: " + segitiga.getAlas());
        System.out.println("Tinggi\t\t: "+ segitiga.getTinggi());
        System.out.println("Luas\t\t: " + segitiga.Luas());
        System.out.println("Keliling\t: " + segitiga.Keliling());
        System.out.println("==============================================================");

        // KUBUS
        Kubus kubus = new Kubus();
        kubus.setSisi(20);
        System.out.println("\t\t\t\tKUBUS");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Sisi\t: " + kubus.getSisi());
        System.out.println("Volume\t: " + kubus.volume());
        System.out.println("==============================================================");


        // SILINDER
        Silinder silinder = new Silinder();
        silinder.setR((float)0.5);
        silinder.setTinggi(700);
        System.out.println("\t\t\t\tSILINDER");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Tinggi\t: " + silinder.getTinggi());
        System.out.println("r\t\t: " + silinder.getR());
        System.out.println("Volume\t: " + silinder.volume());
        System.out.println("==============================================================");

        // BALOK
        Balok balok = new Balok();
        balok.setPanjang(500);
        balok.setLebar(5);
        balok.setTinggi(10);
        System.out.println("\t\t\t\tBALOK");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Panjang\t: " + balok.getPanjang());
        System.out.println("Lebar\t: " + balok.getLebar());
        System.out.println("Tinggi\t: " + balok.getTinggi());
        System.out.println("Volume\t: " + balok.volume());
        System.out.println("==============================================================");


    }
}
