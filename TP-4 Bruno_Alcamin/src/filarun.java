import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class filarun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int f,n, contador=0;
		
		System.out.println("Qual o limite de repetições ?");
		n= entrada.nextInt();
		
		
		System.out.println("Qual o limite da Fila ?");
		
		f=entrada.nextInt();
		
		fila f1 = new fila(f);
		
		do{
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run() {

				
				Random gerador = new Random();
				 
		        boolean resultado = gerador.nextBoolean();
		        
		        if((f1.filacheia()==true)&&(resultado==true)){
		        	resultado=false;
		        }else{
		        	if((resultado == true)&&(f1.filacheia() == false)){
		        		f1.insere();
		        		System.out.println("A Fila contem "+f1.gerQtde()+" pessoas.");
		        	}else{
		        		if((f1.filavazia()==true)&&(resultado==false)){
		        			resultado=true;
		        		}else{
		        			f1.remove();
		        			System.out.println("A Fila contem "+f1.gerQtde()+" pessoas.");
		        		}
		        	}
		        }
			}
		},1000);
		
		contador++;
		}while(contador<=n);
		entrada.close();
	}

}
