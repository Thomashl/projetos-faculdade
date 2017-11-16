
import java.util.Scanner;

public class MaiorMenor {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int numb1, numb2, numb3;
        
        System.out.println("insira tres numeros em sequencia");
        
        System.out.println("Insira o primeiro numero: ");
        numb1 = keyboard.nextInt();
        
        System.out.println("Insira o segundo numero: ");
        numb2 = keyboard.nextInt();
        
        System.out.println("Insira o terceiro numero: ");
        numb3 = keyboard.nextInt();
        
        if (numb1 == numb2 && numb3 == numb1 && numb2 ==numb3){
            
            System.out.println("Os numeros "+" , "+ numb1 +" , "+ numb2 +" , "+ numb3 +" , "+" São iguais.");
            
        }
        
        else{
            if (numb1 >= numb2 && numb1 >= numb3 ){
        
            System.out.println("O numero " + numb1 + " é o maior dos três.");
    
    }
        
        else if(numb2 >= numb1 && numb2 >= numb3){
            
            System.out.println("O numero " + numb2 + " é o maior dos três.");
            
                }
        
        else if (numb3 >= numb1 && numb3 >=numb2){
        
            System.out.println("o numero " + numb3 + " é o maior dos três.");
            
        }
        
       if (numb1 <= numb2 && numb1 <= numb3){
        
            System.out.println("O numero "+ numb1 + " é o menor dos três.");
            
        }
        else if (numb2 <=numb1 && numb2 <= numb3){
        
            System.out.println("O numero "+ numb2 +" é o menor numero dos três.");
            
        }
        else if (numb3 <= numb1 && numb3 <= numb2){
        
            System.out.println("O numero "+ numb3 +" é o menor numero dos três.");
            
        }
        
        
        
        
                
    }
    
}
}