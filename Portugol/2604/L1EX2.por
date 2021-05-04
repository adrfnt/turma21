programa
{
	
	funcao inicio()
	{
		//Objetivo: leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
		//variaveis
		inteiro idadeDia
		inteiro anos
		inteiro meses
		inteiro dias

		//entradas
		escreva("Qual é a idade em dias? ")
		leia(idadeDia)
		
		//processamento 
		anos = (idadeDia/365)
		meses = (idadeDia%365)/12
		dias = (idadeDia%365)%12

		//Saída 
		escreva("anos:",anos,"\n")
		escreva("meses:",meses,"\n")
		escreva("dias:",dias,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */