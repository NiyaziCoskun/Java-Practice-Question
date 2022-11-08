import java.util.Scanner;

public class pratik10 {
    public static void main(String[] args) {
        //Kullanicinin girmis oldugu tamsayinin pozitif mi negatif mi
        // yoksa nötr mü oldugunu dogrulayan ve console'a yaazan bir program yaziniz.
        //Write a program that verifies whether the integer entered by the user is positive,
        // negative or neutral, and runs to the console.
        //Schreiben Sie ein Programm, das überprüft, ob die vom Benutzer eingegebene Ganzzahl positiv,
        // negativ oder neutral ist, und das auf der Konsole ausgeführt wird.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");
        int sayi = input.nextInt();
        
        if (sayi > 0) {
            System.out.println("Sayi pozitif");
            
        } else if (sayi < 0) {
            System.out.println("Sayi negatif");
        } else {
            System.out.println("Sayi nötr");
        }
    }
}
