package est;

public class Pilha  {
	
	private int elementos[];
	private int topo,tamanho;
	

	
	Pilha(int max){
		tamanho = max;
		elementos = new int [tamanho];
		topo =-1;
	}
	
	public void Empilha(int x){
		topo ++;
		elementos[topo]=x;
	}
	
	public int Desempilha(){
		int temp = elementos[topo];
		topo--;
		return temp;
	}

	
	public int getTopo(){
		return topo;
	}
	
	public int getTamanho(){
		return tamanho;
	}
	
	public int getPos(int pos){
		return elementos[pos];
	}
	
	
	//transfere elementos da fila para pilha
	public void trans(){
		
		Pilha p = new Pilha(10);
		
		Fila f = new Fila(10);
		if(f.getInic()<=f.getFim()){
			for(int i=f.getInic();i<=f.getFim();i++){
				p.Empilha(f.Remove());
			}
		}else{
			for(int i = f.getInic();i<=f.getTam();i++){
				p.Empilha(f.Remove());
			}
			
			for(int i =0;i<=f.getFim();i++){
				p.Empilha(f.Remove());
			}
		}
	}
	
	//soma elementos da pilha
	public int Soma(){
		int soma=0;
		for(int i = getTopo();i >-1;i--){
			int aux = getPos(i);
			soma = soma+aux;
		}
		return soma;
	}
	
	
}
