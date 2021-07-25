package com.vektorel;
import java.util.Scanner;

public class Runner_2 {

	public static void main(String[] args) {
		int secim=0;
		do {
			ekranaYaz();
			secim = secimIslemi();
			
		}while(secim!=0);		
		
		
	}//Method sonu
	
	static int secimIslemi() {
		int secim=0;
		boolean secim_durumu=true;
		Scanner sc;
		do {
			sc =  new Scanner(System.in);
			try {
				System.out.print("Seçiniz....: ");
				secim = sc.nextInt();
				secim_durumu= false;
			}catch(Exception ex) {
				System.err.println("Lütfen geçerli bir seçim yapýnýz.");
				secim_durumu = true;
			}
		}while(secim_durumu);
		return secim;
	}
	static void ekranaYaz() {
		System.out.println("*************");
		System.out.println("**  SEÇÝM ***");
		System.out.println("*************");
		System.out.println();
		System.out.println("1-Toplama");
		System.out.println("2-Çýkartma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		System.out.println("0-ÇIKIÞ");		
	}
}// Class Sonu
