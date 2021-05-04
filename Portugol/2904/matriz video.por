programa
{
	
	funcao inicio()
	{
		const inteiro TAMANHO = 3
		inteiro mat[TAMANHO][2], l, c //MATRIZ 3*2 LINHA*COLUNA
		
		para(l=0;l<TAMANHO;l++) //para da linha
		{
			para(c=0;c<2;c++) //para da coluna
			{
				escreva("Valor: ")
				leia(mat[l][c])
				
			}
		}
		limpa()
		para(l=0;l<TAMANHO;l++) //para da linha
		{
			para(c=0;c<2;c++) //para da coluna
			{
				escreva("[ ",mat[l][c]," ]")
			}
			escreva("\n")
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */