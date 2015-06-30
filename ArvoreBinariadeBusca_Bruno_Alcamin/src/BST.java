
public class BST {
	private Node pRaiz;
	
	BST(){
		pRaiz = null;
	}

	public boolean bstVazia(){
		return pRaiz == null;
	}
	private Node insereRecursivo(Node t, int x){

		if(t==null){
			t = new Node(x);
		}else{
			if(x < t.info){
				t.pEsq = insereRecursivo(t.pEsq, x);
			}else{
				t.pDir = insereRecursivo(t.pDir, x);
			}
		}
		return t;
	}
	
	public void insere(int x){
		pRaiz = insereRecursivo(pRaiz, x);
	}
	
	private void preOrdem(Node t){
		if(t != null){
			System.out.println(t.info);
			preOrdem(t.pEsq);
			preOrdem(t.pDir);
		}
	}
	public void mostraPreOrdem(){
		preOrdem(pRaiz);
	}
	private void posOrdem(Node t){
		if(t != null){
			posOrdem(t.pEsq);
			posOrdem(t.pDir);
			System.out.println(t.info);

		
		}
	}
	public void mostraPosOrdem(){
		posOrdem(pRaiz);
	}
	private void emOrdem(Node t){
		if(t != null){
			emOrdem(t.pEsq);
			System.out.println(t.info);
			emOrdem(t.pDir);
		}
	}
	public void mostraEmOrdem(){
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
	public void mostraMax(){
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
	public void mostraMin(){
		min(pRaiz);
	}
	private boolean buscaRecursiva(Node t, int x){
			if(t==null){
				return false;
			}
			if(x == t.info){
				return true;
			}else if(x< t.info){
				return buscaRecursiva(t.pEsq,x);
			}else{
				return buscaRecursiva(t.pDir,x);
			}
	}
	public boolean busca(int x){
		return buscaRecursiva(pRaiz, x);
	}
	
	private void removeRecursivo(Node t,int x){
		Node ant = null;
		Node atual = t;
		while(atual != null){
			if(x == atual.info){
				if(atual == t){
					pRaiz= (t = removeAtual(atual));
				}else{
					if(ant.pDir == atual){
						ant.pDir = removeAtual(atual);
					}else{
						ant.pEsq = removeAtual(atual);
					}
				}

			}
			ant = atual;
			if(x > atual.info){
				atual = atual.pDir;
			}else{
				atual = atual.pEsq;
			}

		}
	}
	private Node removeAtual(Node t){
		Node no1, no2;
		if(t.pEsq == null){
			no2 = t.pDir;
			return no2;
		}else{
			no1 = t;
			no2 = t.pEsq;
			while(no2.pDir != null){
				no1 = no2;
				no2 = no2.pDir;
			}
			if(no1 != t){
				no1.pDir = no2.pEsq;
				no2.pEsq = t.pEsq;
			}
			no2.pDir = t.pDir;

			return no2;
		}
	}
	public void remove(int x){
		removeRecursivo(pRaiz, x);
	}
}
