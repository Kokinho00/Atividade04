package exercicios;

import java.util.Scanner;

public class exercicios01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o salario");
		
		salario = leia.nextDouble();
		System.out.println("Digite o abono");
		abono = leia.nextDouble();
		System.out.println("Resultado");
		novoSalario = salario + abono;
		System.out.println("Novo salario: "+novoSalario);
		
		
		
	}

}
