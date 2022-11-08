import java.util.Scanner;

public class ptatik09 {
    public static void main(String[] args) {
        //Kullanicidan bir düzgün dörtgenin kisa ve uzun kenarlarini alalim
        // ve bu dörtgenin kare mi yoksa dikdörtgen mi oldugunu kullaniciya söyleyelim
        //Let's take the short and long sides of a regular rectangle from
        // the user and tell the user whether this rectangle is a square or a rectangle.
        //Nehmen wir dem Benutzer die kurzen und langen Seiten eines regelmäßigen
        // Rechtecks und teilen ihm mit, ob dieses Rechteck ein Quadrat oder ein Rechteck ist.

        Scanner input = new Scanner(System.in);

        System.out.println("Kisa kenar uzunlugunu giriniz :");
        int kisaKenar = input.nextInt();

        System.out.println("Uzun kenar uzunlugunu giriniz :");
        int uzunKenar = input.nextInt();

        if (kisaKenar == uzunKenar) {
            System.out.println("Bu bir kare");
        }else {
            System.out.println("Bu bir dikdörtgen");
        }
    }
}
