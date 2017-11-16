
package exibetransposta;

 import java.util.Scanner;

public class ExibeTransposta {

 
    public static void main(String[] args) {
    int i, j;
	System.out.println("Insira o numero de linhas e colunas: ");
	
        Scanner keyboard = new Scanner(System.in);
	
        int linha = keyboard.nextInt();
	
        int coluna = keyboard.nextInt();
	
        int vet[][] = new int[linha][coluna];
	
        System.out.println("Insira os numeros da matris, pressione enter apos inserir o numero:");
 	
        for(i = 0; i < linha; i++)
  	{
   	    for(j = 0; j < coluna; j++) 
     	    {
        	vet[i][j] = keyboard.nextInt();
        	System.out.print(" ");
            }
  	}
	
        System.out.println("Matris antes de ser transposta: ");
  	
        for(i = 0; i < linha; i++)
    	{
      	    for(j = 0; j < coluna; j++)
            {
          	System.out.print(vet[i][j]+" ");
            }
            System.out.println(" ");
        }
 	
        System.out.println("Matris apos ser transposta: ");
  	
        for(i = 0; i < coluna; i++)
    	{
      	    for(j = 0; j < linha; j++)
            {
                System.out.print(vet[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}