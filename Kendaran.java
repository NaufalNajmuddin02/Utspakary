package kendaran;


public class Kendaran {
    private String mbil;
    private String Warna;
    private int Lot_p;

    public Kendaran(String mobil, String warna, int Lot){
        this.mbil= mobil;
        this.Warna= warna;
        this.Lot_p= Lot;
    }
    public void Cetak(){
        System.out.println("Mobil = " +this.mbil+
                "\n"+"Warna = "+this.Warna+
                "\n"+"Lot = " +this.Lot_p);
    }
}
