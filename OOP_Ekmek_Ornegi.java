package OOP_Ekmek_Ornegi;

import java.util.Scanner;

class Ekmek {

    private int fiyat;
    private int sure;
    private String ad;

    public Ekmek(int fiyat, int sure, String ad) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.sure = sure;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    @Override
    public String toString() {
        return ("Ekmek Adi:" + ad + " Fiyati:" + fiyat + "TL Pisme Suresi:" + sure + "dk");
    }
}

class EksiMayali extends Ekmek {

    public EksiMayali() {
        super(25, 15, "Eksi Mayali Ekmek");
    }

    @Override
    public String toString() {
        return super.toString() + "Eksi Mayali Ekmek";
    }
}

class Firin {

    private final String ad;
    private Ekmek ekmek;

    public Firin(String ad) {
        this.ad = ad;
    }

    public String getAd(String ad) {
        return ad;
    }

    public void ekmekAl(Ekmek ekmek) {
        this.ekmek = ekmek;
    }

    public void ekmekBilgisi() {
        if (ekmek != null) {
            System.out.println(ekmek);
        } else {
            System.out.println("Ekmek secilmedi!");
        }
    }
}

public class OOP_Ekmek_Ornegi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hosgeldiniz! Beyaz Ekmek icin 1, Eksi Mayali Ekmek icin 2'yi tuslayiniz:");
        int cevap = input.nextInt();

        Firin firin = new Firin("Polatoglu");
        Ekmek beyaz = new Ekmek(10, 5, "Beyaz Ekmek");
        EksiMayali eksi = new EksiMayali();

        if (cevap == 1) {
            firin.ekmekAl(beyaz);
            firin.ekmekBilgisi();
        } else if (cevap == 2) {
            firin.ekmekAl(eksi);
            firin.ekmekBilgisi();
        } else {
            System.out.println("Yanlis girdi yaptiniz!");
        }
    }
}
