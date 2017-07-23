package geometricshapesNEW;

public class PravokutnikNEW {
		
	private double a;
	private double b;

		
	public PravokutnikNEW(double a, double b){
		this.a = a; 
		this.b = b;
	}

		
	public double getA(){
		return this.a;
	}

	public void setA(double a){
		this.a = a;
	}
		
	public double getB(){
		return this.b;
	}

	public void setB(double b){
		this.b = b;
	}

		
	public double opseg(){
		return 2 * this.a + 2 * this.b;
	}
	public double povrsina(){
		return this.a * this.b;
	}
}