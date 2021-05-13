package lista3;

public class Ex1 {

	public static void main(String[] args) {
		
		for(int n = 1000; n <=1999; n++) {
			if(n%11==5) {
				System.out.printf("\n Números divididos por 11 que o resto é = 5 são: %d",n);
			}
		}	

	}
}