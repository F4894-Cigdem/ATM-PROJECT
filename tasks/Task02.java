package J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task02 {
    private static int sonuc;

    public static void main(String[] args) {
      /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */
        Scanner scan = new Scanner(System.in);

        System.out.print("ekrana bir sayı girin ");
        int sayi1 = scan.nextInt();

        System.out.println("sonuc : " +powerOfThree(sayi1));



    }

    public static int powerOfThree(int sayi) {


        if (Math.pow(3,sayi)==0) {
            System.out.println("girilen sayi üçün üssü mü ? " + " " +"true");
        } else {
            System.out.println("girilen sayi üçün üssü mü ? " + " " +"false");
        }
        sonuc=3^sayi;


        return sonuc;

    }
}
