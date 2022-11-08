import java.util.Scanner;

public class pratik15 {
    public static void main(String[] args) {
        //Kullanicidan almis oldugunuz 2 farkli sayidan büyük olan sayiyi "ternary" kullanarak bulan bir program yaziniz.
        //Write a program that finds the number that is greater
        // than 2 different numbers you received from the user using "ternary".
        //Schreiben Sie ein Programm, das die Nummer findet, die größer als 2 verschiedene Nummern ist,
        // die Sie von dem Benutzer erhalten haben, der "ternär" verwendet.

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayi :");
        int s1 = input.nextInt();

        System.out.println("Ikinci syi : ");
        int s2 = input.nextInt();

        int buyukSayi = s2 > s1 ? s2 : s1 ;
        System.out.println("Büyük sayi :" + buyukSayi);
    }
}
