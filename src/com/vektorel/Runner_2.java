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
				System.out.print("Se�iniz....: ");
				secim = sc.nextInt();
				secim_durumu= false;
			}catch(Exception ex) {
				System.err.println("L�tfen ge�erli bir se�im yap�n�z.");
				secim_durumu = true;
			}
		}while(secim_durumu);
		return secim;
	}
	static void ekranaYaz() {
		System.out.println("*************");
		System.out.println("**  SE��M ***");
		System.out.println("*************");
		System.out.println();
		System.out.println("1-Toplama");
		System.out.println("2-��kartma");
		System.out.println("3-�arpma");
		System.out.println("4-B�lme");
		System.out.println("0-�IKI�");		
	}
}// Class Sonu
