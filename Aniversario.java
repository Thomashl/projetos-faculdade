import java.util.Scanner;

public class Aniversario {

 
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
         int dia, mes;
        
         System.out.println("Insira o dia e o mes de seu aniversario em sequencia.");
         
         System.out.println("Dia:");
         dia = keyboard.nextInt();
         
         System.out.println("Mes:");
         mes = keyboard.nextInt();
         
         if(dia >=30 && mes >=12){
         
             System.out.println("dia ou data invalida.");
             
         }
         
         if(mes == 1){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de janeiro,voce nasceu no primeiro trimestre e seu signo e Aquario.");
         }
         
         if(mes == 2){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de fevereiro,voce nasceu no primeiro trimestre e seu signo e Peixes.");
         }
         
         if(mes == 3){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + "de março,voce nasceu no primeiro trimestre e seu signo e Aries.");
         }
         
         if(mes == 4){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de abril,voce nasceu no segundo trimestre e seu signo e Touro.");
         }
         
         if(mes == 5){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de maio,voce nasceu no segundo trimestre e seu signo e Gêmeos.");
         }
         
         if(mes == 6){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de junho,voce nasceu no segundo trimestre e seu signo e Câncer.");
         }
         
         if(mes == 7){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de julho,voce nasceu no terceiro trimestre e seu signo e Leão.");
         }
         
         if(mes == 8){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de agosto,voce nasceu no terceiro semestre seu signo e Virgem.");
         }
         
         if(mes == 9){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de setembro,voce nasceu no terceiro trimestre e seu signo e Libra.");
         }
         
         if(mes == 10){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de outubro,voce nasceu no quarto trimestre e seu signo e Escorpião.");
         }
         
         if(mes == 11){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de novembro,voce nasceu no quarto trimestre e seu signo e Sagitário.");
         }
         
         if(mes == 12){
             
             System.out.println("Entao o dia do seu aniversario e:" + " " + dia + " de dezembro,voce nasceu no quarto trimestre e seu signo e Capricórnio.");
         }
         
         
        
    }
   
    
    
}
