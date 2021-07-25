package com.vektorel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// Excepions - Ýstisnalar - Hata Yönetimi
		
		int s1,s2,toplam;
		Scanner sc = new Scanner(System.in);
		try {// bu kýsým hata olmasý olasý olan kodu içerir.
			System.out.print("Sayý 1...: ");
			s1 = sc.nextInt();
			System.out.print("Sayý 2...: ");
			s2 = sc.nextInt();
			toplam = s1/s2;
			int[] sayilar = new int[2];
			sayilar[2] = toplam;
			System.out.println("Toplam...: "+ toplam);			
		}catch(InputMismatchException exception) {// hata oluþtuðunda bu hatayý yakalýyor ancak programýn
				  // çökmesini engelliyerek uygulamanýn çalýþmasýna devam etme
				  // sini saðlýyor.
			System.out.println("Lütfen Metinsel Giriþ Yapmayýnýz.");			
		}catch(ArithmeticException ex) {
			System.out.println("Sýfýr ile bölme hatasý");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dizinin Sýnýrlarýný aþtýnýz.");
		}catch (Exception e) {
			System.out.println("Beklenmeyen bir hata oluþtu. Lütfen ..");
			System.out.println("Hat...: "+ e.toString());
		}
		
		

	}//Main Sonu
}// Class Sonu
