import java.util.Scanner;

public class pratik20 {
    public static void main(String[] args) {
        //Bir array icerisinde ki en yüksek 2 sayiyi bulan method yaziniz.
        int[] maaslar = {1000,2000,3000,2555,2450};

        int enYuksekSayi = Integer.MIN_VALUE;
        int enYuksekSayi2 = Integer.MIN_VALUE;

        for (int maas: maaslar) {
            if (maas > enYuksekSayi) {
                enYuksekSayi2 = enYuksekSayi;
                enYuksekSayi = maas;
            } else if (maas > enYuksekSayi2) {
                enYuksekSayi2 = maas;

            }
        }
        System.out.println(enYuksekSayi);
        System.out.println(enYuksekSayi2);
    }
}
