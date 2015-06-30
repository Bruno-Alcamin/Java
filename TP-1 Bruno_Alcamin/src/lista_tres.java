
public class lista_tres {
	int elementos[]; 
	int tamanho;
	int p;

	lista_tres (int tam){
		tamanho = tam;
		elementos = new int [tamanho];
		p=-1;	
	}
	
	lista_um list1 = new lista_um (10);
	lista_dois list2 = new lista_dois (20);
	
	public void organiza(){
		int aux = 0;
		for (int i = 0; i < elementos.length; i++){
			for (int j = 0; j < elementos.length; j++){
				if (elementos[i] < elementos[j]){
					aux = elementos[i];
					elementos[i] = elementos[j];
					elementos[j] = aux;
				}
			}
		}
		
		for (int k = 0; k < elementos.length; k++){
			System.out.println(elementos[k]);
		}


	}
	

	public int getp(){
		return p;
	}
	
	public int getvalor(int pos){
		
		return elementos[pos];
	}

}
