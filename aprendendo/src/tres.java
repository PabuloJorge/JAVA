import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, soma;
		Scanner mp = new Scanner (System.in);
		System.out.println("Digite o primeiro n�mero:");
        n1 = mp.nextInt();
        System.out.println("Digite o segundo n�mero:");
        n2 = mp.nextInt();
        soma = n1+n2;
        System.out.printf("A soma dos n�meros �" + soma);
	}
	

}
