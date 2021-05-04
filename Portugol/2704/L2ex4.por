programa
{
	
	funcao inicio()
	{
		//Leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
		//variaveis
		inteiro numero

		//entrada
		escreva("Digite um número: ")
		leia(numero)

		//processamento
		se ((numero%2)==0){
			se(numero>=0){
                escreva("O número é par e positivo")
            }
		}
		senao {
			se(numero<=0){
                escreva("O número é impar e negativo")
            }
		}

		se ((numero%2)==0){
				se(numero<=0){
                	escreva("O número é par e negativo")
            }
		}
		senao {
			se(numero>=0){
                escreva("O número é impar e positivo")
            }
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 693; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */