
public class classfilarun {

		private int elementos[]; 
		int tamanho, inic, fim, qtde;
		
		
		classfilarun (int tam){
			tamanho = tam;
			elementos = new int [tamanho];
			inic=0;
			fim=-1;
			qtde=0;		
		}
		
		public void insere(){
			fim++;
			if(fim==tamanho){
				fim=0;
			}
			int x=0;
			x = (int) (1 + Math.random() *10);
			elementos[fim]=x;
			qtde++;
		}
		
		public void remove(){
			
			inic++;
			if(inic==tamanho){
				inic=0;
			}
			qtde--;
		}
	
		
		public int gerQtde(){
			return qtde;
		}
	
		
		public boolean filacheia(){
			return qtde==tamanho;
		}
		
		public boolean filavazia(){
			return qtde==0;
		}
	
}
