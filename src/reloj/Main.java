package reloj;

public class Main {
	public static int tiempo1 = 4;
	public static int tiempo2 = 7;

	public static boolean done = false;

	public static void main(String[] args) {

		Reloj reloj4 = new Reloj(tiempo1, 4);
		Reloj reloj7 = new Reloj(tiempo2, 1);

		reloj4.start();
		reloj7.start();

		while (done == false) {
			if (!reloj7.isAlive()) {
				System.out.println("Empezamos a contar los 9 segundos");
				done = true;
			}
		}
		while (done == true) {
			if (!reloj4.isAlive()) {
				System.out.println("Ha terminado de contar los 9 segundos");
				done = false;
			}
		}

	}
}
