package odev4;

public class odev4 {

	public static void main(String[] args) {
		
      char grade='A';
      
      switch(grade) {
      case'A':  
    	  System.out.println("mükemmel= geçtiniz");
    	  break;
      case'B':
    	  System.out.println("çok güzel= geçtiniz");
    	  break;
    	  
      case'C':
    	  System.out.println("iyi = geçtiniz");
    	  break;
    	  
      case'D':
    	  System.out.println("fena değil= geçtiniz");
    	  break;  
      case'F':
    	  System.out.println("maalesef kaldınız ");
    	  break;  
    	  default:
    		  System.out.println("GEÇERSİZ NOT GİRİLDİ");
    	  
    	  
      }
	}

}
