import java.util.Scanner;

public class pratik06 {
    public static void main(String[] args) {
        //Kullanicin girmis oldugu e - mail adresinin gecerli bir gmail adresi
        // olup olmadigini gogrulayan bir program yaziniz
        //Kural 1 : @ isaretini icermesi gerekiyor.
        //Kural 2 : @ isaretinden sonra "gmail.com" ifadesine gecmesi gerekiyor

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen email adresini yaziniz :");
        String email = input.next();

        // niyaz@gmail.com -> substring

        int index = email.indexOf("@");
        String gmail = email.substring(index+1);


        if ( !email.contains("@")){
            System.out.println("@isareti olmadan bir email adresi yazamazsiniz.");
        }
        if (!gmail.equals("gmail.com")) {
            System.out.println("Gmail hesabi giriniz .");
        }
        if (email.contains("@") && gmail.equals("gmail.com")) {
            System.out.println("Dogru gmail formati.");
        }
    }
}
