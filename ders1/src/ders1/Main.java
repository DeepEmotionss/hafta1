package ders1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World! ");
		// değişken isimleri camelCase yazılır
		String ortaMetin ="ilginizi çekebilir";
		String altMetin ="vadesüresi";
		System.out.println(ortaMetin);
		
		int vade = 12;
		double dolarDün=12.4;
		double dolarBugün=12.4;
		
		boolean dolarDustuMu=false;
		
		String okYonu="";
		
		
		if (dolarBugün<dolarDün) {
			okYonu="down.svg";
			System.out.println(okYonu);
		
		
		
		
		} else if(dolarBugün>dolarDün) {
			okYonu="up.svg";
			System.out.println(okYonu);
			
			
		}
		
		
		
		
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);

		}
		
		
		//array
		
		String[] krediler= {"hızlı kredi","maaşını halkbantan alanlar"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
