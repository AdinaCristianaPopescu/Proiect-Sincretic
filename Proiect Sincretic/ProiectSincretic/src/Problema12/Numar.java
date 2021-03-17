package Problema12;

public class Numar {
	private int numar;
	public Numar(int numar) {
		this.numar=numar;
	}

	public boolean SumaDePatratePerfecte() {
		for(int i=1;i<numar/2;i++) {
			for(int j=1;j<numar/2;j++) {
				if(i*i+j*j==numar) {
					return true;
				}
			}
		}
		return false;
	}
}