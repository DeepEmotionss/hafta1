package odev11;

public class odev11 {

	public static void main(String[] args) {
		
		String mesaj="  Bugün haava çok güzel  ";
		System.out.println(mesaj);

		System.out.println(mesaj.replace(' ','-'));
		String yeniMesaj=mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));//2 den itibaren yazdır
		System.out.println(mesaj.substring(2,4));
		//4 ü katmaz
		
		for(String kelime:mesaj.split(" ")) {//boşluk bırakır
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toLowerCase());//küçük harfe çevirir
		System.out.println(mesaj.toUpperCase());//büyük harfe çevirir
		System.out.println(mesaj.trim());//baştaki sondaki boşlukları atar
		
	}

}
