package cursojava.primeiroprojeto;

/*Aula 01 - utilização do if else*/
public class aula01 {
	/* Atalho para escrever o main, digita main + aperta crtl + espaço */
	public static void main(String[] args) {
		/* Declaração de variavel */
		int nota1 = 70;
		String nome = "felipe";

		/* criação do if e else */
		if (nota1 >= 70 && nome.equals("felipe")) {
			/* Atalho para escrever o sys.out, digita sysout + aperta crtl + espaço */
			System.out.println("Parabens você foi aprovado");
		} else if (nota1 < 70) {

			System.out.println("voce foi reprovado");
		} else {

			System.out.println("comando invalido");
		}
		/* Atalho para identar o códgio ctrl + shift + F */

	}
}
