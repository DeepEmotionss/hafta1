package odev15;

public class odev15 {

	public static void main(String[] args) {
		// sayı bulma
		
		int[] sayilar=new int [] {1,35,4,5,67,7};
		int aranacak=65;
		
		boolean varMı=false;
		for(int sayi:sayilar) {
			
			if(sayi==aranacak) {
				varMı=true;
				break;
			}
			
		}
		
		
		if(varMı) {
			System.out.println("sayı mevcuttur");
		}
		else {
			System.out.println("sayı yok");
		}

	}

}
