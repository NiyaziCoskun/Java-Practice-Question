import java.util.Scanner;

public class pratik4 {

    public static void main(String[] args) {
        //Kullanicinin yazmis oldugu TC kimlik numarasini,
        // uygun formatta olup olmadigini dogrulayan bir program yaziniz
        //Kural 1 : Kimlik no 0 ile baslayamaz
        //Kural 2 : 11 hane olmak zorundadir
        //Kural : Son rakam cift olmalidir

        Scanner input = new Scanner(System.in);

        System.out.println("Kimlik numarasini griniz :");
        long tcNo = input.nextLong();

        long ilkHane = tcNo / 10000000000l;

        boolean uzunlukDogruMu = (""+tcNo).length() == 11;

        int sonRakam = (int) (tcNo % 10);

        if (ilkHane!=0 && uzunlukDogruMu == true && sonRakam %2 == 0) {
            System.out.println("tebrikler dogru numara");
        }

        if (ilkHane == 0){
            System.out.println("ilk hane 0 olamaz");
        }

        if (uzunlukDogruMu == false) {
            System.out.println("Tc No 11 haneden olusmalidir.");
        }

        if (sonRakam % 2 !=0){
            System.out.println("Son rakam 2 ile tam bölünebilmelidir");
        }

    }
}
