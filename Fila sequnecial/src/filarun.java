import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class filarun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int f,n, contador=0;
		
		System.out.println("Qual o valor de n ?");
		n= entrada.nextInt();
		
		
		System.out.println("Qual o limite da Fila ?");
		
		f=entrada.nextInt();
		
		classfilarun f1 = new classfilarun(f);
		
		
		
		do{
			
			int tempo =  (int) (Math.random()*(4000)+1000);
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run() {

				
				Random gerador = new Random();
				 
		        boolean resultado = gerador.nextBoolean();
		        
		        if((f1.filacheia()==true)&&(resultado==true)){
		        	resultado=false;
		        }else{
		        	if((resultado == true)&&(f1.filacheia()!=true)){
		        		f1.insere();
		        		System.out.println("A Fila contem "+f1.gerQtde());
		        	}else{
		        		if((f1.filavazia()==true)&&(resultado==false)){
		        			resultado=true;
		        		}else{
		        			f1.remove();
		        			System.out.println("A Fila contem "+f1.gerQtde());
		        		}
		        	}
		        }
			}
		},tempo);
		
		contador++;
		}while(contador<=n);
		entrada.close();
	}

}
