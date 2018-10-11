package animal;

public abstract class Mammifere extends Animal {
	
	public final String reproduction="sexuée";
	
	public String gestation="ovipare";

	public abstract void getRegimeAlimentaire();

	public void getTypeGestation() {
		System.out.println("Gestation ovipare");
	}

	public Mammifere(String nom, int taille, int poids, int age, String alimentation) {
		super(nom, taille, poids, age, alimentation);
		// TODO Auto-generated constructor stub
	}

}
