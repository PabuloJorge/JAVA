import java.util.Scanner;

public class seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0, r=0;
		System.out.println("Digite o raio do c�rculo: ");
		Scanner mp = new Scanner (System.in);
		r = mp.nextDouble();
		System.out.println("A �rea de c�rculo � "+calculodearea(a, r));
		
		
		
	}
public static double calculodearea (double a, double r){
	a = (r*r)*3.14;
	return a;
	
}
}
