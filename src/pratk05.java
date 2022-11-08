import java.util.Scanner;

public class pratk05 {
    public static void main(String[] args) {
        //Kullanicinin girmis oldugu "kullanici adi" ve "sifre" bilgilerini kontrol ederek
        //sisteme gris yapip yapamadigini söyleyen bir program yaziniz
        //admin - 123456
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adiniz :");
        String username = input.next();

        System.out.println("sifreniz :");
        String password = input.next();

        if (username.equals("admin") && password.equals("123456")) {
            System.out.println("Welcome to");
        }
        if (!username.equals("admin")) {
            System.out.println("Kullanici adiniz yanlis.");
        }
        if (!password.equals("123456")) {
            System.out.println("sifreniz yanlis");
        }

    }
}
