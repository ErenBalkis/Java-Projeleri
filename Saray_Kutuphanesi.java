package Saray_Kutuphanesi;

import java.util.ArrayList;
import java.util.List;

class Kitap {

    private String ad;
    private String sinifTipi;

    public Kitap(String ad, String sinifTipi) {
        this.ad = ad;
        this.sinifTipi = sinifTipi;
    }

    public String getAd() {
        return ad;
    }

    public String getSinifTipi() {
        return sinifTipi;
    }
}

class SarayKutuphanesi {

    private List<Kitap> kitaplar;

    public SarayKutuphanesi() {
        kitaplar = new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public List<Kitap> kitaplariGoster(String kullaniciTipi) {
        List<Kitap> erişimKitaplari = new ArrayList<>();
        for (Kitap kitap : kitaplar) {
            if (kitap.getSinifTipi().equals(kullaniciTipi) || kitap.getSinifTipi().equals("herkes")) {
                erişimKitaplari.add(kitap);
            }
        }
        return erişimKitaplari;
    }
}

class Koylu {

    private SarayKutuphanesi kutuphane;

    public Koylu(SarayKutuphanesi kutuphane) {
        this.kutuphane = kutuphane;
    }

    public void kitaplariGor() {
        List<Kitap> kitaplar = kutuphane.kitaplariGoster("koylu");
        System.out.println("Koylu kitaplari:");
        for (Kitap kitap : kitaplar) {
            System.out.println(kitap.getAd());
        }
    }
}

class Soylu {

    private SarayKutuphanesi kutuphane;

    public Soylu(SarayKutuphanesi kutuphane) {
        this.kutuphane = kutuphane;
    }

    public void kitaplariGor() {
        List<Kitap> kitaplar = kutuphane.kitaplariGoster("soylu");
        System.out.println("Soylu kitaplari:");
        for (Kitap kitap : kitaplar) {
            System.out.println(kitap.getAd());
        }
    }
}

abstract class halk {

    abstract void okur();
}

class soylu2 extends halk {

    void okur() {
        System.out.println("Soylu kitap okur.");
    }
}

class koylu2 extends halk {

    void okur() {
        System.out.println("Koylu kitap okur.");
    }
}

public class Saray_Kutuphanesi {

    public static void main(String[] args) {
        SarayKutuphanesi kutuphane = new SarayKutuphanesi();

        kutuphane.kitapEkle(new Kitap("Harry Potter", "koylu"));
        kutuphane.kitapEkle(new Kitap("Silmarillion", "soylu"));
        kutuphane.kitapEkle(new Kitap("Kucuk Prens", "herkes"));

        Koylu koylu = new Koylu(kutuphane);
        Soylu soylu = new Soylu(kutuphane);

        koylu.kitaplariGor();
        soylu.kitaplariGor();

        soylu2 Soylu2 = new soylu2();
        koylu2 Koylu2 = new koylu2();

        Soylu2.okur();
        Koylu2.okur();
    }
}
