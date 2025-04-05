package Dizi_Uygulamasi;

import java.util.Scanner;  //GIRILEN DIZIDEKI ELEMANLARIN YERINI DEGISTIRME

public class Dizi_Uygulamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Eleman sayisini belirleme
        System.out.println("Dizinin kac elemanli olacagini giriniz:");
        int ES = input.nextInt(); //eleman sayisi
        int dizi[] = new int[ES];
        //Diziye elman atama
        for (int i = 0; i < ES; i++) {
            System.out.println("Lutfen tam sayilar dizisinin " + (i + 1) + ". elemanini giriniz:");
            int number = input.nextInt();
            dizi[i] = number;
        }
        System.out.printf("Olusturdugunuz dizi= ");
        for (int p = 0; p < ES; p++) {
            System.out.printf(dizi[p] + " ");
        }
        System.out.println();
        //Elemanlarin yerini degistirme
        int devam;
        do {
            int sira1 = -1, sira2 = -1, temp;
            System.out.println("Yerini degistirmek istediginiz sayiyi giriniz:");
            int sayi1 = input.nextInt();
            System.out.println(sayi1 + " sayisinin yerini hangi sayi ile degistirmek istiyorsunuz?");
            int sayi2 = input.nextInt();
            for (int j = 0; j < ES; j++) {
                if (sayi1 == dizi[j]) {
                    sira1 = j;
                    break;
                }
            }
            for (int k = 0; k < ES; k++) {
                if (sayi2 == dizi[k]) {
                    sira2 = k;
                    break;
                }
            }
            //Eger her iki sayi da dizide bulunuyorsa yerlerini degistirebliliriz.
            if (sira1 != -1 && sira2 != -1) {
                temp = dizi[sira2];
                dizi[sira2] = sayi1;
                dizi[sira1] = temp;
                System.out.println("Dizinin yeni hali:");
                for (int m = 0; m < ES; m++) {
                    System.out.printf(dizi[m] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Hatali giris yaptiniz! Bir veya her iki sayi dizide bulunamadi!");
            }
            System.out.println("Devam etmek icin 1'i, durmak icin 0'i tuslayiniz:");
            int devam1 = input.nextInt();
            devam = devam1;
        } while (devam == 1);

    }

}
