import java.util.Scanner;

public class pratik13 {
    public static void main(String[] args) {
        //Kullanicinin girmis oldugu 2 sayidan büyük olan sayiyi bulan bir program yaziniz
        //Write a program that finds the number greater than 2 entered by the user.
        //Schreiben Sie ein Programm, das die vom Benutzer eingegebene Zahl größer als 2 findet.

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz : ");
        int s1 = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz :");
        int s2 = input.nextInt();

        if (s1 > s2) {
            System.out.println("1.sayi daha büyük");
        } else if (s2 > s1) {
            System.out.println("2.sayi daha büyük");
        }else {
            System.out.println("sayilar esit");
        }
    }
}
