
public class Lampada {
	
	private boolean onoff;
	
	Lampada(){
		onoff=false;
	}
	
	public void acesa(){
		onoff=true;
	}

	public void apagada(){
		onoff=false;
	}
	
	public String situacao(){
		if(onoff == true){
			return  "Acesa"; 
		}else{
			return "Apagada";
		}		
	}
	
}
