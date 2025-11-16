package cursojava.primeiroprojeto;

/* comando switch e case */
public class aula04 {
	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Switch case: Operações exatas */
		switch (media) {
		case 70:
			System.out.println("Aluno(a) aprovado(a)! nota final: " + media);
			break;
		case 90:
			System.out.println("Aluno(a) aprovado(a)! parabens! nota final:  " + media);
			break;
		case 60:
			System.out.println("Aluno(a) em recuperação nota final: " + media);
			break;
		/* entrega uma resposta padrao caso não se enquadre em nenhum caso */
		default:
			System.out.println("Aluno(a) reprovado(a) nota final: " + media);
			break;
		}
	}
}
