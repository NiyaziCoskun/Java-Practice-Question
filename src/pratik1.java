import java.util.Scanner;

public class pratik1 {

    public static void main(String[] args) {
        //Kullanicidan boy ve kilo bilgisini alrak vücut kitle endexini hesaplayalim.
        //18.5 <  =>>>>> zayifsin, daha fazla yemelisin
        //18.5 >= && <25  =>>>> ideal kilodasin
        //25 >= && < 30  =>>>> kilolusun, biraz egzersiz yapmalisin
        //30>  =>>>>>> Obezlik. Sagligina dikkat etmelisin.
        //VKE = kilo / (boy*boy)


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz.");
        double boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz.");
        double kilo = input.nextDouble();

        double vke = kilo / (boy*boy);
        System.out.println("Vücut kitle endeksniz :" + vke);

        if (vke<18.5) {
            System.out.println("Zayifsin, daha fazla yemelisin");
        }
        if (vke>=18.5 && vke<25){
            System.out.println("ideal kilodasin");
        }
        if (vke>=25 && vke<30) {
            System.out.println("kilolusun, biraz egzersiz yapmalisin");
        }
        if (vke>=30) {
            System.out.println("Obezlik, sagligina dikkat etmelisi.");
        }
    }
}