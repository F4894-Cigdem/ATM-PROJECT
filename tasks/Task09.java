package J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Saniyeye çevirmek istediğiniz saati giriniz : ");
        int sayi1 = scan.nextInt();

        System.out.println("sonuc: " + howManySeconds(sayi1) + " saniye");


    }

    public static int howManySeconds(int sayi) {

        int sonuc = sayi * 3600;
        return sonuc;


    }
}
