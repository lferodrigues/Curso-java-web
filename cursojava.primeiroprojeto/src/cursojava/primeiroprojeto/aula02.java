package cursojava.primeiroprojeto;

/*Aula 02 Operadores ternario simples*/
public class aula02 {
	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		/* Condições lógicas com IF e Else */
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}

		/* Operadores ternários são para micro validações */

		String saidaResultado;
		/* o operador ? = If e : = Else */
		saidaResultado = media >= 70 ? "Aluno Aprovado"
				: (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Aluno(a) Reprovado(a)";
		System.out.println("Saida pelo oprador ternario simples: " + saidaResultado);
	}
}
