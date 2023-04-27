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
		double[] notas1Alunos = new double[quantidadeAlunos];
		double[] notas2Alunos = new double[quantidadeAlunos];

		for (int i = 0; i < notas1Alunos.length; i++){
			System.out.printf("Digite a nota 1 do %dº aluno: ", i+1);
			notas1Alunos[i] = input.nextDouble();

			System.out.printf("Digite a nota 2 do %dº aluno: ", i+1);
			notas2Alunos[i] = input.nextDouble();
		}

//		for (int i = 0; i < notasAlunos.length; i++){
//			System.out.printf("Nota do %dº aluno: %.2f%n", i+1, notasAlunos[i]);
//		}

		double somaMedias = 0;
		for (int i = 0; i < notas1Alunos.length; i++){
			somaMedias += (notas1Alunos[i] + notas2Alunos[i])/2.0;
		}

		double mediaTurma = somaMedias/quantidadeAlunos;
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