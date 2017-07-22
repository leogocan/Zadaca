package geometricshapes;

public class Main {
	
	public static void main(String[] args) {
		Krug krug = new Krug();
		krug.opsegk();
		krug.povrsinak();
		
		Pravokutnik pravokutnik = new Pravokutnik();
		pravokutnik.opsegp();
		pravokutnik.povrsinap();
		
		Trokut trokut = new Trokut();
		trokut.opsegt();
		trokut.povrsinat();
	}

}
