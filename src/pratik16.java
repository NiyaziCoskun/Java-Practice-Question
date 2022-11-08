import java.util.Scanner;

public class pratik16 {
    public static void main(String[] args) {
        //Kullanicinin vize vefinal notlarini kullanarak harf notunu hesaplayan bir "ternary" yaziniz
        //Not : ic ice ternary kullanmaniz gerekir. Tek satirda bu islemi yapiniz.

        int vizeNotu = 50;
        int finalNotu = 80;
        int ortalama = vizeNotu*40/100 + finalNotu*60/100;

        String harfNotu = ortalama<50 ? "FF" : ortalama < 75 ? "CC" : ortalama < 90 ? "BB" : "AA";

        /*if (ortalama < 50 ) {
            harfNotu = "FF";
        } else if (ortalama < 75) {
            harfNotu = "CC";
        } else if (ortalama< 90) {
            harfNotu ="BB";
        } else {
            harfNotu = "AA";
        }*/
        System.out.println(harfNotu);
    }
}
