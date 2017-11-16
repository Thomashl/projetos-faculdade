import java.util.Scanner;

public class Divisao{
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		Double n1, n2, divisao;

		System.out.println("digite o primeiro numero:");
		n1 = keyboard.nextDouble();
		System.out.println("digite o segundo numero:");
		n2 = keyboard.nextDouble();
		divisao = n1 / n2;

		System.out.println("o valor da divisão é:" + divisao);

	}
}