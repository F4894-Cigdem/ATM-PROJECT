package J11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.

		Scanner scan=new Scanner(System.in);
		System.out.println("Saniyeye çevirmek istediğiniz saati giriniz : ");
		int sayi1= scan.nextInt();

		System.out.println("sonuc: "+saatiSaniyeyeCevir(sayi1)+" saniye");

		Scanner scan2=new Scanner(System.in);
		System.out.println("Kilometreye çevirmek istediğiniz mili giriniz : ");
		int sayi2= scan.nextInt();

		System.out.println("sonuc: "+miliKilometreyeCevir(sayi2)+" kilometre");

		Scanner scan3=new Scanner(System.in);
		System.out.println("Grama çevirmek istediğiniz kilogramı giriniz : ");
		int sayi3= scan.nextInt();

		System.out.println("sonuc: "+kilogramiGramaCevir(sayi3)+" gram");

	}


	public static int saatiSaniyeyeCevir(int sayi){

			int sonuc= sayi*3600;
			return sonuc;

	}
	public static double miliKilometreyeCevir(int sayi2){

			double sonuc2= sayi2* (1.609344);
			return sonuc2;

	}
	public static double kilogramiGramaCevir(int sayi3){

			double sonuc3= sayi3* (0.001);
			return sonuc3;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
