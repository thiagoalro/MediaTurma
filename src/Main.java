/*Fazer um programa que recebe a nota de cada aluno de uma
turma. O programa deve mostrar a média geral da turma e a
quantidade de alunos com nota maior ou igual a média da
turma.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos na turma: ");
		int quantidadeAlunos = input.nextInt();
		double[] notasAlunos = new double[quantidadeAlunos];

		for (int i = 0; i < notasAlunos.length; i++){
			System.out.printf("Digite a nota do %dº aluno: ", i+1);
			notasAlunos[i] = input.nextDouble();
		}

		for (int i = 0; i < notasAlunos.length; i++){
			System.out.printf("Nota do %dº aluno: %.2f%n", i+1, notasAlunos[i]);
		}

	}
}