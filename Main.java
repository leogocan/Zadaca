package geometricshapesNEW;

public class Main {
	
	public static void main(String[] args) {
		
		PravokutnikNEW pravokutnikNEW = new PravokutnikNEW(2, 3);
		System.out.println("Opseg pravokutnikaNEW je: " + pravokutnikNEW.opseg());
		System.out.println("Povrsina pravokutnikaNEW je: " + pravokutnikNEW.povrsina());
		
		TrokutNEW trokutNEW = new TrokutNEW(3, 4, 5);
		System.out.println("Opseg trokutaNEW je: " + trokutNEW.opseg());
		System.out.println("Povrsina trokutaNEW je: " + trokutNEW.povrsina());
		
		KrugNEW krugNEW = new KrugNEW(4);
		System.out.println("Opseg krugaNEW je: " + krugNEW.opseg());
		System.out.println("Povrsina krugaNEW je: " + krugNEW.povrsina());
		
	}
}