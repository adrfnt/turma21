programa
{
    funcao inicio()
    {
        //variaveis
        cadeia alunes[3] 
        real notas[3] 
        cadeia msg

        //CADASTRANDO OS NOMES E NOTAS - Entradas e Processamentos
        para (inteiro x=0; x<3; x++){
            escreva("Digite o nome do alune: ")
            leia(alunes[x])
            escreva("Digite  a nota:" )
            leia(notas[x])
        }

        escreva("\n")
        escreva("LISTA DE ALUNES\n")
        escreva("----------------------------\n")

        para (inteiro x=0; x<3; x++){
            se (notas[x] <= 5){
                msg = "estude um pouco mais!!"
            }
            senao
            {
                msg = "continue assim!!"
            }

            //saida
            escreva(alunes[x]," sua nota é ",notas[x]," ",msg,"\n")
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */