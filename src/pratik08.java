import java.util.Scanner;

public class pratik08 {
    public static void main(String[] args) {
        //Kullanicidan bugünün hangi gün oldugunu alin ve eger gün "cumartesi" yada "pazar ise
        //console' a "Hafta Sonu" yazdiralim, degilse "Haftaici" yazdiralim
        //Get the day from the user and print "Weekend" to the console of,
        // the day is "Saturday" or "Sunday", otherwise "Weekday".
        //Holen Sie sich den Tag vom Benutzer und drucken Sie "Wochenende",
        // auf die Konsole, der Tag ist "Samstag" oder "Sonntag", ansonsten "Wochentag".

        Scanner input = new Scanner(System.in);

        System.out.println("What day is today");
        String day = input.next();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        }else {
            System.out.println("Weekday");
        }
    }
}
