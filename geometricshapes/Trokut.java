package geometricshapes;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Trokut {
	
	double strA = 3;
	double strB = 4;
	double strC = sqrt(pow(strA, 2)+pow(strB, 2));
	
	public Trokut() {
		
	}
	
	public void opsegt() {
		System.out.println("Opseg trokuta je: " + (strA + strB + strC));
	}
	
	public void povrsinat() {
		System.out.println("Povrsina trokuta je: " + ((strA * strB)) / 2);
	}
}