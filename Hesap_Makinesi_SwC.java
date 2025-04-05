package Hesap_Makinesi_SwC;

import java.util.Scanner;

public class Hesap_Makinesi_SwC {    //Switch-case ile hesap makinesi

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz ilk tam sayiyi giriniz");
        int n = input.nextInt();
        System.out.println("Lutfen yapilacak islemi giriniz:(+,-,*,/)");
        char operator = input.next().charAt(0);
        System.out.println("Lutfen islem yapmak istediginiz ikinci tam sayiyi giriniz");
        int k = input.nextInt();

        int result = 0;
        boolean gecerli = true;

        switch (operator) {
            case '+':
                result = n + k;
                break;
            case '-':
                result = n - k;
                break;
            case '*':
                result = n * k;
                break;
            case '/':
                if (k != 0) {
                    result = n / k;
                } else {
                    gecerli = false;
                    System.out.println("Sifira bolunemez");
                }
                break;
            default:
                System.out.println("Yanlis operator girisi!");
                gecerli = false;
                break;
        }
        if (gecerli) {
            System.out.println("Sonuc=" + result);
        }

    }

}
