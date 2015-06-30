package classes;



public class Pessoas {
	
	int pes_id;
	String pes_nome;
	String pes_rg;
	String pes_cpg;
	String pes_end;
	String pes_tel;
	String pes_dtcadastro;
	int pes_status;
	
	
	public Pessoas (){
		
	}
	
	
	public Pessoas(int pes_id,String pes_nome, String pes_rg, String pes_cpg, String pes_end, String pes_tel, String pes_dtcadastro, int pes_status){
		this.pes_id = pes_id;
		this.pes_nome = pes_nome;
		this.pes_rg = pes_rg;
		this.pes_cpg = pes_cpg;
		this.pes_end = pes_end;
		this.pes_tel = pes_tel;
		this.pes_dtcadastro = pes_dtcadastro;
		this.pes_status = pes_status;	
	}
	
	
	public int getPes_id(){
		return pes_id;
	}
	
	public void setPes_id(int pes_id){
		this.pes_id = pes_id;
	}
	
	public String getPes_nome(){
		return pes_nome;
	}
	
	
	public void setPes_nome(String pes_nome){
		this.pes_nome= pes_nome;
	}
	
	public String getPes_rg(){
		return pes_rg;
	}
	
	
	public void setPes_rg(String pes_rg){
		this.pes_rg= pes_rg;
	}

	
	public String getPes_cpg(){
		return pes_cpg;
	}
	
	
	public void setPes_cpg(String pes_cpg){
		this.pes_cpg= pes_cpg;
	}

	
	public String getPes_end(){
		return pes_end;
	}
	
	
	public void setPes_end(String pes_end){
		this.pes_end= pes_end;
	}

	
	public String getPes_tel(){
		return pes_tel;
	}
	
	
	public void setPes_tel(String pes_tel){
		this.pes_tel= pes_tel;
	}
	
	
	public String getPes_dtcadastro(){
		return pes_dtcadastro;
	}
	
	public void setPes_dtcadastro(String pes_dtcadastro){
		this.pes_dtcadastro = pes_dtcadastro;
	}
	
	public int getPes_status(){
		return pes_status;
	}
	
	public void setPes_status(int pes_status){
		this.pes_status = pes_status;
	}

}	
