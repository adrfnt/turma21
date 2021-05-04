programa
{
	
	funcao inicio()
	{
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
		de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
		
		inteiro valores[5], x
		inteiro maiorPontuacao =0.00

		para (x=0; x<5; x++){
           	escreva("Digite uma pontuação: ")
           	leia(valores[x])
		}
		
		para (x=0; x<5; x++){
         		se(valores[x] >= maiorPontuacao){
            	   maiorPontuacao=valores[x]
            	}
         }
		escreva("\nMaior pontuação digitada é: ",maiorPontuacao)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 494; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */