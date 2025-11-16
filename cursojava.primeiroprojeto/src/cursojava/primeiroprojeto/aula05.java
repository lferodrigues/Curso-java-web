package cursojava.primeiroprojeto;

/* Operadores relacionais */
public class aula05 {
	public static void main(String[] args) {
		int nota1 = 90;
		int nota2 = 90;
		System.out.println("Testando o operador relacional de igualdade (==)");

		if (nota1 == nota2) {
			System.out.println("As notas são iguais");
		} else {
			System.out.println("As notas são diferentes" + " nota1: " + nota1 + " e nota2: " + nota2);
		}

		int nota3 = 91;
		int nota4 = 90;
		System.out.println("Testando o operador relacional diferentes (!=)");
		if (nota3 != nota4) {
			System.out.println("As notas são diferentes" + " nota3: " + nota3 + " e nota4: " + nota4);
		} else {
			System.out.println("As notas são iguais");
		}

		int nota5 = 91;
		int nota6 = 90;
		System.out.println("Testando o operador relacional menor (<)");
		if (nota6 < nota5) {
			System.out.println("As nota6: " + nota6 + " e menor que a nota5: " + nota5);
		} else {
			System.out.println("As notas são iguais");
		}

		int nota7 = 98;
		int nota8 = 95;
		System.out.println("Testando o operador relacional menor (<)");
		if (nota7 > nota8) {
			System.out.println("As nota7: " + nota7 + " e maior que a nota8: " + nota8);
		} else {
			System.out.println("As notas são iguais");
		}

	}
	/* final da classe */
}
