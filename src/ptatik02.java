import java.util.Scanner;

public class ptatik02 {

    public static void main(String[] args) {
        // Kullanicida bir günde kac bardak cay ictigini ve bir caya kac seker attigi bilgisini alalim.
        // Daha sonra 1 yilda ve 60 yillik bir ömürde kac seker kullandiginizi hesaplayip
        //Kendisine kilogram cinsinden söyleyelim
        //1 günde = 5 * 3 * 3 / 1000
        //1 yilda = 5 * 3 * 365 / 1000

        Scanner input = new Scanner(System.in);

        System.out.println("Bir günde kac bardak cay iciyorsunuz ?");
        double bardak = input.nextDouble();

        System.out.println("Bir cay bardagina kac tane seker atiyorsunuz ?");
        double zucker = input.nextDouble();

        double yillik = bardak * zucker * 3 * 365 / 1000;
        double yillik60 = bardak * zucker * 3 * 365 * 60 / 1000;

        if (yillik == 0) {
            System.out.println("Tebrikler, seker tüketmeyerek daha saglikli olabilirsiniz.");
        }
        if (yillik > 0) {
            System.out.println("yilda tükettiginiz seker miktari(kg) " + yillik);
            System.out.println("60 yilda tükettiginiz seker miktari(kg)" + yillik60);
        }

    }
}
