
public class Triangulo {

	private int a;
	private int b;
	private int c;


	Triangulo(int Ladoa,int Ladob,int Ladoc){
		a= Ladoa;
		b= Ladob;
		c= Ladoc;
	}


	public boolean isTriangulo(){
		if ((a>b+c)||(b>c+a)||(c>a+b)) {
			return true;
		}else{
			return false;
		}
	}
	
	public int Perimetro(){
		int perimetro= a+b+c;
		return perimetro;
	}
	
	public double Area(){
		int sp = (a+b+c)/2;
		double area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		return area;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
}



