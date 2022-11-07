import java.util.Random;

public class pratik03 {
    public static void main(String[] args) {
        //Rastgele bir sayi üreterek, üretilen sayinin hangi aralikta oldugunu console yazdiran bir program yaziniz.
        //Rastgele sayi üretirken Random classini kullaniriz
        //Random rastgele = new Random();
        //rastgele.nextInt(100);
        Random rastgele = new Random();

        int number = rastgele.nextInt(101);

        if (number<=25) {
            System.out.println("Sayi 0 -25 araligindadir.");
        }
        if (number > 25 && number <= 50) {
            System.out.println("Sayi 25-50 araligindadir");
        }
        if (number>50) {
            System.out.println("Sayi 50-100 araligindadir");
        }



    }
}
