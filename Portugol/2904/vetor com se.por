programa
{
	
	funcao inicio()
	{
		//variaveis:  vetor (declarar a quantidade de dados)
		cadeia alunes [3]
		real notas [3]
		cadeia msg
		inteiro numero=0

		//entradas
		alunes[0]= "MARIA"
		notas[0]= 8.00
		alunes[1]= "PEDRO"
		notas[1]= 7.00
		alunes[2]= "ARIEL"
		notas[2]= 5.00

		escreva("Digite o numero do aluno entre 0 e 2: ")
		leia(numero)

		//procesamento
		se (notas[numero] <=5){
			msg= "estude um pouco mais!!!"
		}
		senao{
			msg = "continue assim!!!"
		}

		//saida
		escreva(alunes[numero]," sua nota é ",notas[numero],", ",msg,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */