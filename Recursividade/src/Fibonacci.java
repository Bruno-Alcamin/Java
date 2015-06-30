import java.util.Scanner;

public class Fibonacci {

	public static double fib(int n){

		if(n==1||n==2){
			return 1;
		}else{
			return fib(n-1)+fib(n-2);			
		}		
	}


	public static int fibo(int n){
		if(n==0){
			return 0;
		}else{
			if(n==1){
				return 1;
			}else{
				return fibo(n-1)+fibo(n-2);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual posição do Fibonacci ?");

		int x = entrada.nextInt();

		if(x==0){
			System.out.println("Numero invalido!");
		}else{

			System.out.println(fib(x));

			System.out.println(fibo(x));
		}

		entrada.close();

	}

}
