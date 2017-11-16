import java.util.Scanner;
public class SegundoGrau {
    public static void main(String[] args) 
      {
          Scanner s = new Scanner(System.in);
        int a, b, c;
        double x1, x2, delta;
     
        System.out.println("dada a equacao de segundo grau:ax^2 + bx + c");
        System.out.print("Digite o valor de A:");
        a = s.nextInt();
        System.out.print("Digite o valor de B:");
        b = s.nextInt();
        System.out.print("Digite o valor de C:");
        c = s.nextInt();
        System.out.println("dada a equacao de segundo grau:"+a+"x^2 + "+b+"x + "+c);
        delta = b * b - 4 * a * c;
        if(delta > 0)
        {
            System.out.println("Resultados iguasi de diferentes");
            x1 = ( - b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("x1 =:"+x1);
            System.out.println("x2 =:"+x2);
        }
        else if(delta == 0)
        {
            System.out.println("Resultados sao reais e iguais");
            x1 = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("resultado:"+x1);
        }
        else
        {
            System.out.println("Como delta menor que zero nao possui raiz real");
        }
    }
}