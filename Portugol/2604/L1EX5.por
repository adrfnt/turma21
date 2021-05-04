programa
{
	
	funcao inicio()
	{
		//objetivo  leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		//variaveis
		inteiro nota1,nota2,nota3,p1=2,p2=3,p3=5,media
		inteiro mediaPonderada

		//entrada
		escreva("Digite a primeira nota:")
		leia(nota1)
		escreva("\nDigite a segunda nota:")
		leia(nota2)
		escreva("\nDigite a terceira nota:")
		leia(nota3)

		//processamento
		media=nota1*p1+nota2*p2+nota3*p3
		mediaPonderada= media/(p1+p2+p3)

						
		//saida		
		escreva("\nA média é ",mediaPonderada)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 618; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */