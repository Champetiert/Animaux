package animal;


/**
 * @author Champetier thomas
 *
 */
public class Chat extends Mammifere{
	private String race;
	private String couleur;
	private String miaulement;
	


	/**
	 * @param nom
	 * @param race
	 * @param couleur
	 * @param miaulement
	 * @param alimentation
	 * @param taille
	 * @param poids
	 * @param age
	 */
	public Chat(String race, String couleur, String miaulement, String nom, int taille, int poids, int age, String alimentation) {
		super(nom, taille, poids, age, miaulement);
		this.race = race;
		this.couleur = couleur;
		this.miaulement = miaulement;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.getNom()+" est un chat "+this.couleur+" de la race des "+this.race+".\n "
				+ "Il a "+this.getAge()+" ans mesure "+this.getTaille()+" cm et pèse "+this.getPoids()+" kg "
				+ "enfin il se nourrit principalement de "+this.getAlimentation();
	}

	/**
	 * le chat lance un miaulement
	 */
	void miauler() {
		System.out.println(this.miaulement);
	}

	/**
	 * @param temp durée de sommeil en seconde
	 * @throws InterruptedException
	 */
	void dormir(int temp) throws InterruptedException {
		for (int i = 0; i < temp; i++) {
			Thread.sleep(1000);
			System.out.println("zzzzzz");
			
		}
	}

	void chasse(String cible) {
		System.out.println(this.getNom() + " chasse " + cible);
	}

	void manger() {
		System.out.println("mange du "+this.getAlimentation());

	}

	@Override
	public void getRegimeAlimentaire() {
		// TODO Auto-generated method stub
		
	}
}
