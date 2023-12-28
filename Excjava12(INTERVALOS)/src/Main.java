import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Descubra se seu número pertence aos intervalos:\n"
				+ "\n[25:50]"
				+ "\n[0:25]"
				+ "\n[75:100]");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite um número real: ");
		double X = sc.nextDouble();
		
		if (X > 25 && X <= 50) {
			
			System.out.println("O intervalo é [25:50]");
		}
		else if (X >= 0 && X <= 25) {
			
			System.out.println("O intervalo é [0:25]");
		}
		else if (X >= 75 && X <= 100) {
			
			System.out.println("O intervalo é [75:100]");
		}
		else {
			
			System.out.println("Intervalo inválido, Sr");
		}
		
		
		sc.close();
	}

}
