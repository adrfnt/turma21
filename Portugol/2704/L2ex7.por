programa
{
	
	funcao inicio()
	{
		//Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.

		//variaveis
		real altura
		real base

		escreva("Digite a altura do triangulo: ")
		leia(altura)

		escreva("Digite a base do triangulo: ")
		leia(base)

		se (altura>0 e base>0)
		{
			escreva("Os valores são válidos")
		}

		senao
		{
			escreva("Os valores são inválidos")
		}

		//saida
		escreva("\nA area do triangulo é ",altura*base/2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */