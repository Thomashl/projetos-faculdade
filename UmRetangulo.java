import java.util.Scanner;

public class UmRetangulo {

    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        
        Double x, y, area;
        
        System.out.println("insira os valores de X e Y do retangulo em sequencia.");
        
        System.out.println("X: ");
        x = keyboard.nextDouble();
        
        System.out.println("Y: ");
        y = keyboard.nextDouble();
        
        area = x * y;
        
        System.out.println("A area do retangulo e:" + area);
        
    }
    
}
