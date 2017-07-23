package geometricshapesNEW;

import static java.lang.Math.sqrt;

public class TrokutNEW {
	
	private double a;
	private double b;
	private double c;
	
	
	public TrokutNEW(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public double getA() {
		return this.a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public void setC(double c) {
		this.c = c;
	}
	
	
	public double opseg() {
		return this.a + this.b + this.c;
	}
	
	/* Postoji li neki nacin da se ovaj dolje poluopseg skrati tj. da se ta metoda 
	nazove s, ali da ostane ovo popseg. Probao sam, ali nije bas bilo urodilo plodom... */
	public double popseg() {
		return (opseg() / 2);
	}
	
	public double povrsina() {
		return sqrt(popseg() * (popseg() - this.a) * (popseg() - this.b) * (popseg() - this.c));
	}
	
	

}
