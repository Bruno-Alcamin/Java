// atributos privados metodos publicos.



public class Contador { // declaração de um objeto de compartilha as mesmas caracteristicas
	
	private int contador; // variavel que determina caracteristica da class
	
	Contador(int valorinicial){
		contador=valorinicial;
	}
	
	public void incrementa(){ // metodo  
		contador++;
	}
	
	public void decrementa(){
		contador--;
	}
	
	public int valorcontador(){
		
		return contador;
	}
}
