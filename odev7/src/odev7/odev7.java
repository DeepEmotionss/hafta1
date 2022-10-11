package odev7;

public class odev7 {

	public static void main(String[] args) {
		//diziler
        String ogrenci1="  ";
        String ogrenci2="  ";
        String ogrenci3="  ";
        String ogrenci4="  ";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------------");
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]="leman";
		ogrenciler[1]="lale";
		ogrenciler[2]="ayse";
		ogrenciler[3]="leyla";
		
		for(int i=0;i<ogrenciler.length;i++) {
			
			System.out.println(ogrenciler[i]);
			
		}
		System.out.println("----------------------");
		
		for(String ogrenci:ogrenciler) {
			
			System.out.println(ogrenci);
			
		}
		
		
		
		
		
		
	}

}
