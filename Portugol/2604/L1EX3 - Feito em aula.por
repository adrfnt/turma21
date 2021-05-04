programa
{
		funcao inicio()
	{
		//nome -objetivo:  Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

		//variaveis - ingredientes
	
		inteiro tempoDuracao
		inteiro horas 
		inteiro minutos
		inteiro segundos 

		//entradas -preparando mesa etc
		escreva("Qual o tempo de duração do evento em segundos? ")
		leia(tempoDuracao)
		
		//processamento - modo de preparo
		horas = (tempoDuracao/3600)
		minutos = (tempoDuracao%3600)/60
		segundos = (tempoDuracao%3600)%60

		//Saída - colocando no forno e tirando
		escreva("horas:",horas,"\n")
		escreva("minutos:",minutos,"\n")
		escreva("segundos:",segundos,"\n")
		
		//fim
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 605; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */