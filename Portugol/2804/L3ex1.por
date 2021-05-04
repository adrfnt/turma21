programa
{
	inclua biblioteca Matematica -->mat
	/* A prefeitura deseja saber de 20 habitantes:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.*/
	
	funcao inicio()
	{
		
		const inteiro HABITANTES= 20
		real mediaSalario = 0.00
		real maiorSalario= 0.00
		real salario= 0.00
		real somaSalario= 0.00
		real mediaFilhos= 0.00
		real porcentagem= 0.00
		inteiro qtdFilhos=0
		real somaFilho=0.00
		real contadorSalarioAte100= 0.00
		
		para (inteiro x=1; x<=HABITANTES ; x++)
		{
			escreva("Insira o valor do salário: R$")
			leia(salario)
			escreva("Quanto filhos tem? ")
			leia(qtdFilhos)

			somaSalario=somaSalario+salario //somaSalario+=salario
			somaFilho=somaFilho+qtdFilhos  //somaFilhos+=qtdFilhos
			mediaSalario=mat.arredondar((somaSalario/HABITANTES), 2)
			mediaFilhos=mat.arredondar((somaFilho/HABITANTES), 2)

			se(salario>maiorSalario){
				maiorSalario=salario
			}
			se(salario<=100){}
				contadorSalarioAte100++ //contadorSalarioAte100=contadorSalarioAte100+1
			}

			porcentagem = mat.arredondar(((contadorSalarioAte100/ HABITANTES) * 100),2)

			escreva ("\nA média de salarios é: ",mediaSalario)
       		escreva ("\nA média de filhos é: ", mediaFilhos)
        		escreva ("\nO maior salario é de: ", maiorSalario)
        		escreva ("\nA porcentagem de salários maior que R$100,00 é de: ",porcentagem,"%")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */