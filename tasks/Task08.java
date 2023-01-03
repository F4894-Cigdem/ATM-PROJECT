package J11_MethodCreation.tasks;


import java.util.Scanner;

public class Task08 {

    private static int sonuc;

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir yıl giriniz : ");
        int yil1 = sc.nextInt();
        System.out.println("sonuc = " +artikYil(yil1));

    }

    public static int artikYil(int yil) {

        if ((yil % 4 == 0) && (yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println("girdiğiniz yil artık yıl  :-)");
        } else {
            System.out.println("girdiğinz yıl artık yıl değildir  :-(");
        }
        return yil;
    }





}
