
public class ListaOrdenada extends Node {

	private Node head;
	
	ListaOrdenada(){
		head=null;
	}
	
	public void insere(int x){
		
		Node aux = new Node();
		
		aux.info=x;
		
		if(head==null||x<head.info){
			aux.prox=head;
			head=aux;
		}else{
			Node aux2 = head;
				while((aux2.prox!=null)&&(aux2.prox.info<x)){
					aux2 =aux2.prox;
				}
				aux.prox=aux2.prox;
				aux2.prox=aux;		
		}
	
	}
	
	
	public int Remove(int x){
		Node aux2 = head;
		if(aux2.info ==x){
			head=aux2.prox;
		}else{
			while(aux2.prox!=null){
				if((aux2.prox.info==x)&&(aux2.prox!=null)){
					aux2.prox=aux2.prox.prox;
					break;
					}
				if(aux2.prox==null){
						aux2=null;
						break;
					}
				aux2 =aux2.prox;
				}	
			}
		return x;
		}
	
	public void MostraLista(){
		Node aux = head;
		while(aux !=null){
			System.out.println(aux.info);
			aux = aux.prox;
		}
		
	}
	
	public boolean Busca(int x){
		boolean flag=false;
		Node aux = head;
		while(aux !=null){
			if(aux.info==x){
				flag = true;
				break;
			}else{
				aux = aux.prox;
			}
		}
		return flag;
	}
	
	
	public boolean ListaVazia(){
		return head == null;
	}
	
	
	
	
}
