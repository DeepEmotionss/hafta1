package odev10;

public class odev10 {

	public static void main(String[] args) {
		String mesaj="bugün haava çok güzel";
		System.out.println(mesaj);

		System.out.println("eleman sayısı:  "+ mesaj.length());
		
		System.out.println("5. eleman  "+mesaj.charAt(4) );
		System.out.println(mesaj.concat(" yaşasın"));//sona ekle
		System.out.println(mesaj.startsWith("a"));//a ile mi başlıyor
		System.out.println(mesaj.endsWith("l"));//l ile mi bitiyor
		char[] karakterler=new char[5]; 
		mesaj.getChars(0, 4, karakterler, 0);
		
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));//a nın indeksi
		System.out.println(mesaj.lastIndexOf('a'));//a nın sondan indeksi
		
	}
	

}
