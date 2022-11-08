import java.util.Scanner;

public class pratik14 {
    public static void main(String[] args) {
        //Kullanicinin girmis oldugu 3 sayidan büyük olan sayiyi bulan bir program yaziniz.
        //Write a program that finds the number greater than 3 entered by the user.
        //Schreiben Sie ein Programm, das die vom Benutzer eingegebene Zahl größer als 3 findet.

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz : ");
        int s1 = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz :");
        int s2 = input.nextInt();

        System.out.println("ucuncu sayiyi giriniz :");
        int s3 = input.nextInt();

        if (s1 >= s2 && s1 >= s3) {
            System.out.println("En büyük sayi : " + s1);
        } else if (s2 >= s1 && s2 >= s3) {
            System.out.println("En büyük sayi : "+ s2);
        } else if (s3 >= s1 && s3 >= s2) {
            System.out.println("Enbüyük sayi : " + s3);
        }

    }

}
