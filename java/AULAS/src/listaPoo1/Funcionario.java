package listaPoo1;

import java.util.Scanner;

public class Funcionario {
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	ClasseFuncionario func1 = new ClasseFuncionario();
	
	System.out.println("Informe o nome do funcionario: ");
	func1.nome = leia.next();
	System.out.println("Informe a função do funcionário: ");
	func1.funcao = leia.next();
	System.out.println("Informe o salário sem beneficios: ");
	func1.salario = leia.nextInt();
	System.out.println("Informe o valor dos beneficios: ");
	func1.beneficios = leia.nextInt();
		
	System.out.println(func1.cargo()+" recebe R$"+(func1.salario+func1.beneficios)+", contando beneficios.");
	leia.close();
	

	}
}
