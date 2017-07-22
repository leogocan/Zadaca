package geometricshapes;

import static java.lang.Math.*;

public class Krug {
	
	double R = 3;
	
	public Krug() {
		
	}
	
	public void opsegk() {
		System.out.println("Opseg kruga je: " + (2 * R * PI));
	}
	
	public void povrsinak() {
		System.out.println("Povrsina kruga je: " + (pow(R, 2) * PI));
	}
}