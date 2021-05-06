package lista;

import java.util.Scanner;

public class L1ex4 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	//d = r + s / 2
	//r = (a+b)2
	//s = (b+c)2
	
	//variaveis
	int a, b, c;
	double d, r, s;
	
	//entradas
	System.out.println("Digite o valor de a: ");
	a = leia.nextInt();
	System.out.println("Digite o valor de b: ");
	b = leia.nextInt();
	System.out.println("Digite o valor de c: ");
	c = leia.nextInt();
	
	//processamentos
	r = Math.pow((a+b),2);
	s = Math.pow((b+c),2);
	d = (r+s)/2;
	
	//saidas
	System.out.println("Para os valores a=" +a+ ", b=" +b+ " e c=" +c+ ":");
	System.out.println("r=" +r+ " s=" +s);
	System.out.println("d=" +d);
	
	leia.close();
	}
}