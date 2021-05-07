package lista0VO;


import java.util.Scanner;

public class L1ex8 {

	public static void main(String[] args) {
		
		Scanner	leia = new Scanner(System.in);
		
		//variaveis
		final double pdistribuidor = 0.28;
		final double pimposto = 0.45;
		double custoconsumidor= 0.00;
		double custofabrica= 0.00;
		double percentagemdistribuidor=0.00;
		double impostos= 0.00;
		
		//entrada
		System.out.println("digite o custo de fabrica: R$ ");
		custofabrica=leia.nextDouble();
		
		//processamento
		percentagemdistribuidor = Math.round(custofabrica*pdistribuidor);
		impostos = (custofabrica*pimposto);
		custoconsumidor=custofabrica  +percentagemdistribuidor + impostos;
			
		//saidas
		System.out.println("Preço do carro : R$ "+custofabrica);		
		System.out.println("Distribuidor   : R$ "+percentagemdistribuidor);
		System.out.println("Custo Consumidor : R$ "+custoconsumidor);
	    		
	    leia.close();
	    		
		}
}