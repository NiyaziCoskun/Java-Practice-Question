import java.util.Scanner;

public class pratik12 {
    public static void main(String[] args) {
        //Kullanicinin girmis oldugu vize ve final sinav notlarini kullanarak harf notu hesaplayan bir program yaziniz.
        //Write a program that calculates letter grades using the midterm and final exam grades entered by the user.
        //Schreiben Sie ein Programm, das Briefnoten anhand der vom Benutzer eingegebenen
        // Zwischen- und Abschlussprüfungsnoten berechnet.

        Scanner input = new Scanner(System.in);
        System.out.println("Vize notunuz : ");
        double vizeNotu = input.nextDouble();

        System.out.println("Final Notunuz: ");
        double finalNotu = input.nextDouble();

        double ortalama = vizeNotu*40/100 + finalNotu*60/100;
        
        if (ortalama < 40) {
            System.out.println("Harf notunuz : FF");
        } else if (ortalama < 50) {
            System.out.println("Harf notunuz : DD");
        } else if (ortalama < 60 ) {
            System.out.println("Harf notunuz : CC");
        } else if (ortalama < 70) {
            System.out.println("Harf notunuz : BB");
        } else if (ortalama < 80) {
            System.out.println("Harf notunuz : BA");
        }else {
            System.out.println("Harf notunuz : AA");
        }

    }
}
