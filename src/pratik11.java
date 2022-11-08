import java.util.Scanner;

public class pratik11 {
    public static void main(String[] args) {
        //Kullaniciya yanina semsiye alip almamasi gerektigini söyleyen bir program yazalim.
        //Lassen Sie uns ein Programm schreiben, das dem Benutzer mitteilt,
        // ob er einen Regenschirm mitnehmen soll oder nicht.
        //Let's write a program that tells the user whether to take an umbrella or not.
        //kosullar: 1- Hava yagmurlu olabilir 2- Arabasi olabilir
        //Bedingungen: 1- Es kann regnen 2- Es kann ein Auto haben
        //conditions: 1- It may be rainy 2- It may have a car

        Scanner input = new Scanner(System.in);

        System.out.println("Arabaniz var mi? (true/false) ");
        boolean car = input.nextBoolean();

        System.out.println("Hava yagmurlu mu? (true/false) ");
        boolean rainy = input.nextBoolean();

        if (car && rainy) {
            System.out.println("Semsiyeye gerek yok ama yagmur var.");
        } else if (car && !rainy) {
            System.out.println("Semsiyeye gerek yok, cunku yagmur yagmiyor");
        } else if (!car && rainy) {
            System.out.println("Semsiyeye ihtiyacin olacak");
        } else if (!car && !rainy) {
            System.out.println("Semsiyeye ihtiyacin olmayacak");
        }
    }
}
