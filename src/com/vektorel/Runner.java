package com.vektorel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// Excepions - �stisnalar - Hata Y�netimi
		
		int s1,s2,toplam;
		Scanner sc = new Scanner(System.in);
		try {// bu k�s�m hata olmas� olas� olan kodu i�erir.
			System.out.print("Say� 1...: ");
			s1 = sc.nextInt();
			System.out.print("Say� 2...: ");
			s2 = sc.nextInt();
			toplam = s1/s2;
			int[] sayilar = new int[2];
			sayilar[2] = toplam;
			System.out.println("Toplam...: "+ toplam);			
		}catch(InputMismatchException exception) {// hata olu�tu�unda bu hatay� yakal�yor ancak program�n
				  // ��kmesini engelliyerek uygulaman�n �al��mas�na devam etme
				  // sini sa�l�yor.
			System.out.println("L�tfen Metinsel Giri� Yapmay�n�z.");			
		}catch(ArithmeticException ex) {
			System.out.println("S�f�r ile b�lme hatas�");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dizinin S�n�rlar�n� a�t�n�z.");
		}catch (Exception e) {
			System.out.println("Beklenmeyen bir hata olu�tu. L�tfen ..");
			System.out.println("Hat...: "+ e.toString());
		}
		
		

	}//Main Sonu
}// Class Sonu
