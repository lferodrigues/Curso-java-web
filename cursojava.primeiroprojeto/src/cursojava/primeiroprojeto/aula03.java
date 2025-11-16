package cursojava.primeiroprojeto;

/*Operações lógicas aninhada */
public class aula03 {
	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		/* Operações logicas aninhadas: São operações dentro operações */
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aluno(a) está aprovado parabens!" + media);
				} else {
					System.out.println("Aluno(a) está aprovado!" + media);
				}
			} else {
				System.out.println("Aluno(a) está em recuperação!" + media);
			}
		} else {
			System.out.println("Aluno(a) reprovado!" + media);
		}

	}

}
