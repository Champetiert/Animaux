package animal;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Chat felix=new Chat("Persan", "roux", "mihouar" ,"felix",  30, 3,15,"croquette");
		System.out.println(felix);
		felix.chasse("souris");
		felix.miauler();
		felix.manger();
		felix.dormir(20);

	}

}
