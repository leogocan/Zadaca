package geometricshapesNEW;

import static java.lang.Math.*;

public class KrugNEW {
	
	private double R;
	
	
	public KrugNEW(double R) {
		this.R = R;
	}
	
	
	public double getR() {
		return this.R;
	}
	
	public void setR(double R) {
		this.R = R;
	}
	
	
	public double opseg() {
		return 2 * this.R * PI;
	}
	
	public double povrsina() {
		return pow(this.R, 2) * PI;
	}

}
