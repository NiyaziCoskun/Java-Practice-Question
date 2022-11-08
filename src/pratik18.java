import java.util.Scanner;

public class pratik18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz :");
        int s1 = input.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz :");
        int s2 = input.nextInt();

        System.out.println("Islem seciniz\n1 : Toplama\n2 : cikarma\n3 : carpma\n4 : bölme");
        int secim = input.nextInt();

        switch (secim) {
            case 1 : {
                System.out.println("Toplama :" + (s1+s2));
                break;
            }
            case 2 : {
                System.out.println("cikarma :" + (s1-s2));
                break;
            }
            case 3 : {
                System.out.println("carpma :" + (s1*s2));
                break;
            }
            case 4 : {
                System.out.println("bölme :" + (s1/s2));
                break;
            }
            default: {
                System.out.println("Lütfen 1,2,3,4 secimlerinden birini seciniz");
            }
        }
    }
}
