programa
{
	inclua biblioteca Matematica -->mat
	inclua biblioteca Calendario --> cal
	
	funcao inicio()
	{
		/*Projeto: etapa Graduação - Usar o  bonus no media  se no momento do movimento a media fica negativa, 
		ajusta na nota final e diminuir no bonus ( valor maximo de 2 pontos de bonus)*/

		//Variaveis Geral
		const inteiro qtde_total = 3, rodada = 3
		inteiro matricula=1, numero=0,qtde_mes[12], mes[12], mes_atual = cal.mes_atual()
		cadeia cpf="000.000.000-00" , tipo[]={"Básico","MÉDIO","GRADUAÇÃO","PÓS","MESTRADO"}
		logico status=verdadeiro

		//Definir Variaveis especificas - Graduação
		real pontuacaoNota[3] //Inserir os demais movimentos (10)
		real pontuacaoAtual = 0.00
		real usarBonus = 2.00

		//Entradas
		escreva("EducaNorte\nEnsinar é o nosso forte\n")
		escreva("\n-----------------------------------\n")
		escreva("\n1 - BÁSICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n")
		escreva("Digite o código da opção selecionada: ")
		leia(numero)
		escolha(numero)
		{
			caso 3:
			limpa()
				escreva("EducaNorte\nEnsinar é o nosso forte\n")
		     	escreva("\n-----------------------------------\n")
		     	escreva("\nEnsino: ",tipo[numero-1])
		     	escreva("\nMatricula: ",matricula)
		     	escreva("\nCPF: ",cpf)
		         	se(status==verdadeiro)
		     	{
		     		escreva("\nStatus: 1 - Ativo")
		     	}
		     	senao
		     	{
		     		escreva("\nStatus: 2 - Inativo")
		     	}
		     	escreva("\n-----------------------------------\n")
		     		para (inteiro x=0;x<rodada;x++){
						escreva("Insira uma nota: ")
						leia(pontuacaoNota[x])
		
						pontuacaoAtual+=pontuacaoNota[x]

					 
							
						se(pontuacaoAtual>=0){
							escreva("Sua soma de notas é: ",pontuacaoAtual,"\n")
						}
						senao se(usarBonus>0 e pontuacaoAtual<0){
								pontuacaoAtual=0.00
								usarBonus-- //tirando 1 do bonus
								escreva("Você utilizou 1 ponto do bônus. Agora você tem: ",usarBonus," de bônus. \n")
								escreva("Sua soma de notas é: ",pontuacaoAtual,"\n")
							}
							senao{
								escreva("Você não possui mais bônus. Sua nota continuará negativa.")
								}
							}
						}
							
						
														
		}	
				            
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */