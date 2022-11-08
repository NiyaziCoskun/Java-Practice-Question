import java.util.Scanner;

public class pratik07 {
    public static void main(String[] args) {
        //Kullanicinin almis oldugu ürün miktari üzerinden indirim yaparak ödemesi gereken toplam tutari söyleyiniz.
        //Eger aldigi üründen
        //1-10 arasi ssatin aldiysa %10,
        //10-50 arasi satin aldiysa %20,
        //50 üstü satin aldiysa %25 indirim yapalim.



        Scanner input = new Scanner(System.in);

        System.out.println("Urun fiyatini giriniz:");
        double fiyat = input.nextDouble();

        System.out.println("Urun adedini griniz");
        double miktar = input.nextDouble();

        float normalFiyat = (float) (fiyat*miktar);
        float indirimliFiyat = 0.0f;

        if ( miktar < 11) {
            indirimliFiyat = normalFiyat*90/100;
        }
        if (miktar > 10 && miktar <= 50) {
            indirimliFiyat = normalFiyat*80/100;
        }
        if (miktar > 50) {
            indirimliFiyat = normalFiyat*75/100;
        }

        System.out.println("Normal:" + normalFiyat);
        System.out.println("indirimli :" + indirimliFiyat);
    }
}
