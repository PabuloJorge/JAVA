package testes;

public class prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Jo�o";
		imprimeNome("Empty");
	}

	public static void imprimeNome(String nome) {
		if (!nome.isEmpty()) {
			System.out.println("Tudo bem " + nome + "?");
		} else {
			System.out.println("O nome � " + nome + "?");
		}
	}

}
