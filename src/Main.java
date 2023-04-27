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

		Aluno[] alunos = new Aluno[quantidadeAlunos];

		for (int i = 0; i < alunos.length; i++){
			System.out.printf("Digite a nota do %dº aluno: ", i+1);
			//alunos[i] = input.nextDouble();
		}

//		for (int i = 0; i < notasAlunos.length; i++){
//			System.out.printf("Nota do %dº aluno: %.2f%n", i+1, notasAlunos[i]);
//		}

		double somaNotas = 0;
		for (double notasAluno : notasAlunos) {
			somaNotas += notasAluno;
		}

		double mediaTurma = somaNotas/quantidadeAlunos;
		System.out.printf("Média da turma: %.2f%n", mediaTurma);

		int contador = 0;
		for (int i = 0; i < notasAlunos.length; i++){
			if (notasAlunos[i] >= mediaTurma){
				contador++;
			}
		}

		System.out.printf("Quantidade de alunos com nota maior ou igual que a média da turma: %d", contador);

	}
}