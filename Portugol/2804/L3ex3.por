programa
{
	
	funcao inicio()
	{
		/*Faça um programa que pegue um número do teclado e calcule a soma de todos os números de 1 até ele.*/

		
		inteiro numero, contador, soma = 0
 
		escreva ("Digite um numero: ")
		leia(numero)
		
		contador = numero
		
		  faca {
		  	soma = soma + contador
		  	contador=contador-1		  
		  }enquanto (contador >= 1)

		escreva("A soma de todos os numeros de 1 até ", numero, " é ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 429; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */