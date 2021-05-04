programa {
	funcao inicio() {
		/*
		 * Temos 4 time (SPFC, SANTOS, PALMEIRAS, CORINTHIANS)
		 * G-Ganho, P-Perdeu, E-Empate
		 * G = 3p, P= 0p, E=1p
		 * 3-Rodadas
		 * Lista com nome e pontos.
		 */
		//var
		const inteiro RODADA = 3
		cadeia times[4] = {"SPFC", "SANTOS", "PALMEIRAS", "CONRINTHIANS"}
		inteiro pontos[4]
		caracter resposta

		//entradas
		para(inteiro numero = 0; numero < RODADA; numero++) {//NUMERO DE RODADAS
			para(inteiro i = 0; i < 4; i++) {//PERGUNTA PARA CADA TIME
				escreva("O "+ times[i] + " (G)anhou, (P)erdeu ou (E)mpatou? ")
				leia(resposta)
				se (resposta == 'G') {
					pontos[i] +=3
				}senao se(resposta =='P') {
					pontos[i] += 0 //pontos[i]=pontos[i]+0
				}senao se(resposta == 'E'){
					pontos[i] += 1
				}	
			}	
		}
		//escreva(times[1] + "somou" + pontos[1])
		escreva("-----------RESULTADOS-----------\n")
		para(inteiro x=0; x < 4; x++) {
			escreva(times[x] + " : Pontos:" + pontos[x]+ "\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 702; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */