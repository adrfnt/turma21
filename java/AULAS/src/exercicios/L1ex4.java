package exercicios;

import java.util.Scanner;

public class L1ex4 {
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
		//variaveis
		double a, b, c, d, r, s;
		
		//entradas
		System.out.println("Informe o Valor de A: ");
		a=leia.nextDouble();
		System.out.println("Informe o Valor de B: ");
		b=leia.nextDouble();
		
		//processamento e saida
		
		r=(a+b) * (a+b);
		System.out.println("O valor de R é "+r);
		System.out.println("insira o valor de C ");
		c=leia.nextDouble();
		s= (b+c) * (b+c);
		System.out.println("o valor de s é "+s);
		d=(r+s) /2;
		System.out.println("D é igual a:"+s);
		
		leia.close();
	}
	
}
