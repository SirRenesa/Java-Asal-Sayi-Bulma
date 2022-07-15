import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hangi Sayiyi Hesaplamak İstediginizi Giriniz:");
        Scanner insayi = new Scanner(System.in);
        int sayi = insayi.nextInt();

        boolean ifPrime = true;

        for (int i = sayi - 1; i > 1 ; i--) {
            int mod = sayi % i;

            if (mod == 0){

                ifPrime = false;

            }


           }
        if (ifPrime){
            System.out.println("Sayi Asal");

        } else {
            System.out.println("Sayi Asal Degil");

        }

    }
}