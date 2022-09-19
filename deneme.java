package giris;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;


public class Not Ortalaması Hesaplayan Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Fizik notu: ");
		int fizikN = input.nextInt();
		
		System.out.print("Kimya notu: ");
		int kimyaN = input.nextInt();
		
		System.out.print("Turkce notu: ");
		int turkceN = input.nextInt();
		
		System.out.print("Tarih notu: ");
		int tarihN = input.nextInt();
		
		System.out.print("Muzik notu: ");
		int muzikN = input.nextInt();
		
		System.out.print("Matematik notu: ");
		int matematikN = input.nextInt();
		
		double toplam = (fizikN+ kimyaN+tarihN+turkceN+muzikN+matematikN)/6;
		
		String sonuc= (toplam >= 60 ? "Gecti" : "Kaldi");
		
		System.out.println(sonuc);
		
		
	}
}
