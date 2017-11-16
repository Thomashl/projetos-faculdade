

import java.util.Scanner;

public class DoisRetangulos{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double ret1X, ret1Y, ret1Comprimento, ret1Altura;
        
        double ret2X, ret2Y, ret2Comprimento, ret2Altura;
	
		System.out.print("Insira as coordenadas x e y do primeiro retangulo assim como o comprimento e a altura na devida ordem : ");
		 ret1X = input.nextDouble();
		
                 ret1Y = input.nextDouble();
		
                 ret1Comprimento = input.nextDouble();
		
                 ret1Altura = input.nextDouble();
		
                
                System.out.print("Insira as coordenadas x e y do segundo retangulo assim como o comprimento e a altura na devida ordem: ");
		
                 ret2X = input.nextDouble();
		
                 ret2Y = input.nextDouble();
		
                 ret2Comprimento = input.nextDouble();
		
                 ret2Altura = input.nextDouble();

		
		if	((Math.pow(Math.pow(ret2Y - ret1Y, 2), .05) + ret2Altura / 2 <= ret1Altura / 2) && 
			(Math.pow(Math.pow(ret2X - ret1X, 2), .05) + ret2Comprimento / 2 <= ret1Comprimento / 2) &&
			(ret1Altura / 2 + ret2Altura / 2 <= ret1Altura) &&
			(ret1Comprimento / 2 + ret2Comprimento / 2 <= ret1Comprimento))
			
                    System.out.println("O segundo retangulo esta dentro do primeiro retangulo.");
		
                else 
                    if ((ret1X + ret1Comprimento / 2 > ret2X - ret2Comprimento) ||
			(ret1Y + ret1Altura / 2 > ret2Y - ret2Altura))
			
                    System.out.println("O segundo retangulo esta se sobrepondo ao primeiro.");
		
                else
			
                    System.out.println("o segundo e o primeiro retangulo nao se sobrepoem.");
	}
}