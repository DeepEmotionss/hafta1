package odev12;

public class odev12 {
	public static void main(String[] args) {
		
		//asal sayı hesaplama
		int number=5;
		
		if(number==2) {
			
			System.out.println("2 en küçük sal sayıdır");
			
		}
		
		if(number==1) {
			
			System.out.println("geçersiz sayı ");
			
		}
		
		
		for(int i=2; i<number;i++) {
			
		if(number%i==0	) {
			System.out.println(number+" asal sayı değildir");
			break;
			
			
		}
		else {
			System.out.println(number +" asal sayıdır");
			break;
		}
		
		}
		
}
}