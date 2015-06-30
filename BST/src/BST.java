
public class BST extends Node {

	private Node pRaiz;
	private boolean aux = false;

	BST(){
		pRaiz=null;	
	}

	public boolean BSTVazia(){
		return pRaiz == null;
	}

	private Node InsereRecursivo(Node t, int x){

		if (t==null){
			t = new Node(x);
		}else{
			if(x< t.info){
				t.pEsq= InsereRecursivo(t.pEsq, x);
			}else{
				t.pDir= InsereRecursivo(t.pDir, x);
			}
		}
		return t;
	}

	public void  insere (int x){
		pRaiz =InsereRecursivo(pRaiz,x);
	}

	private void preOrdem(Node t){

		if (t !=null){
			System.out.println(t.info);
			preOrdem(t.pEsq);
			preOrdem(t.pDir);
		}
	}


	public void MostraPreOrdem(){
		preOrdem(pRaiz);
	}


	private void posOrdem(Node t){

		if (t !=null){

			posOrdem(t.pEsq);
			posOrdem(t.pDir);
			System.out.println(t.info);
		}
	}

	public void MostraposOrdem(){
		posOrdem(pRaiz);
	}


	private void emOrdem(Node t){

		if (t !=null){

			emOrdem(t.pEsq);
			System.out.println(t.info);
			emOrdem(t.pDir);

		}
	}

	public void MostraemOrdem(){
		emOrdem(pRaiz);
	}


	private void max(Node t){

		if(t!=null){

			max(t.pDir);
			if(t.pDir==null){
				System.out.println(t.info);
			}

		}

	}

	public void Mostramax(){
		max(pRaiz);
	}


	private void min(Node t){

		if(t!=null){
			min(t.pEsq);
			if(t.pEsq==null){
				System.out.println(t.info);
			}
		}
	}



	public void Mostramin(){
		min(pRaiz);
	}

	private boolean Busca(Node t, int x ){

		if(t!=null){
			if(x==t.info){
				aux=true;
			}else{
				if(x>=t.info){
					Busca(t.pDir,x);
					if(t.info==x){
						System.out.println(aux= true);
					}
				}else{
					Busca(t.pEsq,x);
					if(t.info==x){
						System.out.println(aux= true);
					}
				}
			}
		}
		return aux;
	}

	public boolean MostraBusca(int x){
		return Busca(pRaiz, x);
	}
		
	private void Remove(Node t,int x){
		
		if(x==t.info){
			if(t.pEsq==null){
			t = t.pDir;
			}else{
				if(t.pDir==null){
					t = t.pEsq;
				}
			}
		}else{
			if(x<t.info){
				Remove(t.pEsq,x);
			}else{
				Remove(t.pDir,x);
			}
		}
		
	}
	
	public void MostraRemove(int x){
		Remove(pRaiz,x);
	}
	
	
		
}