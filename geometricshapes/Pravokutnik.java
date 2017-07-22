package geometricshapes;

public class Pravokutnik {
	
	double strA = 3;
	double strB = 4;
	
	public Pravokutnik() {
		
	}
	
	public void opsegp() {
		System.out.println("Opseg pravokutnika je: " + (2 * strA + 2 * strB));
	}
	
	public void povrsinap() {
		System.out.println("Povrsina pravokutnika je: " + (strA * strB));
	}
}