import java.util.Scanner;
public class AreaTriangulo{
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	double altura, base, area;

	System.out.println("informe a altura:");
	altura = keyboard.nextDouble();
	System.out.println("informe a base:");
	base = keyboard.nextDouble();
	area = (base*altura) / 2;
	System.out.println("Area do triangulo =:" + area);
}
}