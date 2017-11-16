
package media;

import java.util.Scanner;

public class Media {

   
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        int x;
        
        System.out.println("informe a quantidade de alunos: ");
        
        x = keyboard.nextInt();
         
        double[] prova1 = new double[x];
        double[] prova2 = new double[x];
        double[] prova3 = new double[x];
        double[] prova4 = new double[x];
        double[] trabalho1 = new double[x];
        double[] trabalho2 = new double[x];
        double mediaf;
         
        
        for (int i = 0; i < prova1.length; i ++){
        
            prova1[i]= 0;
            prova2[i]= 0;
            prova3[i]= 0;
            prova4[i]= 0;
            trabalho1[i]= 0;
            trabalho2[i]= 0;
        
        }
        
        System.out.println("Informe as notas");
        
        for(int i = 0; i < prova1.length; i++){
        
            System.out.println("Prova 1 do aluno " + (i+1) + ": ");
            prova1[i] = keyboard.nextDouble();
        
        }
        
        System.out.println("Informe as notas");
        
        for(int i = 0; i < prova2.length; i++){
        
            System.out.println("Prova 2 do aluno " + (i+1) + ": ");
            prova2[i] = keyboard.nextDouble();
        
        }
        
        System.out.println("Informe as notas");
        
        for(int i = 0; i < prova3.length; i++){
        
            System.out.println("Prova 3 do aluno " + (i+1) + ": ");
            prova3[i] = keyboard.nextDouble();
        
        }
        
        System.out.println("Informe as notas");
        
        for(int i = 0; i < prova4.length; i++){
        
            System.out.println("Prova 4 do aluno " + (i+1) + ": ");
            prova4[i] = keyboard.nextDouble();
        
        }
        
        System.out.println("Informe as notas");
        
        for(int i = 0; i < trabalho1.length; i++){
        
            System.out.println("Trabalho 1 do aluno " + (i+1) + ": ");
            trabalho1[i] = keyboard.nextDouble();
        
        }
        
        System.out.println("Informe as notas");
        
        for(int i = 0; i < trabalho2.length; i++){
        
            System.out.println("Trabalho 2 do aluno " + (i+1) + ": ");
            trabalho2[i] = keyboard.nextDouble();
        
        }
        
        for (int i = 0; i < prova1.length ; i++){
            
            mediaf = (((prova1[i] + prova2[i] + prova3[i] + prova4[i])/4)*0.6) + (((trabalho1[i] + trabalho2[i]) /2)*0.4);
            
            if(mediaf >=6){
            
                System.out.println("Aluno" + x + "esta aprovado, pois tirou: " + mediaf);
                
            }
            else{
            
                System.out.println("Aluno" + x + "esta reprovado, pois tirou: " + mediaf);
                
            }
        
        }
        
    }
    
}
