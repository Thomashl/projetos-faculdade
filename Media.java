import java.util.Scanner;

public class Media{
	public static void main(String[] args) {
		int qtd_alunos=0;
		double mp=0, mt=0, mf=0, n=0;

		Scanner input = new Scanner(System.in);

		System.out.println("Por favor, informe a quantidade de alunos:");
		qtd_alunos = input.nextInt();

		double media[] = new double[qtd_alunos];
		String nome[] = new String[qtd_alunos];
		int idade[] = new int[qtd_alunos];
 		int rga[] = new int[qtd_alunos];


		System.out.println("Por favor, informe os dados");

		for (int i=0;i<nome.length ;i++ ) {
			System.out.println("Informações referentes ao " + i +"º aluno");
			System.out.println("Nome: ");
			nome[i] = input.next();
			System.out.println("Idade:");
			idade[i] = input.nextInt();
			System.out.println("RGA:");
			rga[i] = input.nextInt();
			System.out.println("Notas das provas: ");
			for(int j = 0 ; j < 4; j++){
				n = input.nextDouble();
				mp += n;
			}
			System.out.println("Notas dos trabalhos: ");
			for(int j = 0 ; j < 2; j++){
				n = input.nextDouble();
				mt += n;
			}

			mf = (mp/4)*0.6 + (mt/2)*0.4;
			media[i] = mf;
			mp = 0;
			mt = 0;
			mf = 0;
		}

		System.out.print("Dados fornecidos: \n");		
		
		for (int i=0;i<nome.length ;i++ ) {

			System.out.println("Informações referentes ao " + i +"º aluno");
			System.out.println("Nome: " + nome[i]);
			System.out.println("Idade:" + idade[i]);
			System.out.println("RGA:" + rga[i]);
			System.out.println("Média final = " + media[i]);

			if(media[i]>=6)
				System.out.println("Aprovado! Parabéns!\n");
			else
				System.out.println("Reprovado! Estude mais!\n");
			
		}
	
	}
}