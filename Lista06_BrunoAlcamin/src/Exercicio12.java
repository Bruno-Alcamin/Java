import java.util.Scanner;


public class Exercicio12 {
	
	public static double valorfuturo (double capital, double taxa, int prazo){
		
		double fv = capital*(Math.pow((1+taxa), prazo));
		
		return fv;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double capital,taxa,total;
		
		int prazo;
		
		Scanner entrada =  new Scanner (System.in);
		
		System.out.println("Qual o valor do capital ?");
		
		capital = entrada.nextDouble();
		
		System.out.println("Qual o valor do taxa ?");
		
		taxa = entrada.nextDouble();
		
		System.out.println("Qual o valor do prazo ?");
		
		prazo = entrada.nextInt();
		
		// chamando função
		
		total = valorfuturo(capital,taxa,prazo);
		
		System.out.println("Valor Calculado: "+total);
		
		entrada.close();

	}

}
