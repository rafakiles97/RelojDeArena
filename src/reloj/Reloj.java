package reloj;

public class Reloj extends Thread {

	private int initialTime;
	private int maxVuelta;

	public Reloj(int initialTime, int maxVuelta) {
		super();
		this.initialTime = initialTime;
		this.maxVuelta = maxVuelta;
	}

	public int getInitialTime() {
		return initialTime;
	}

	public int getMaxVuelta() {
		return maxVuelta;
	}

	private synchronized void esperarXsegundos(int segundos) {
		try {
			for (int i = 0; i < segundos; i++) {
				Thread.sleep(1000);
				System.out.println("Ha pasado un segundo segun el reloj "
						+ getInitialTime());
			}
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		try {
			Thread.sleep(1);// lo pongo para que visualmente termine despues de
							// que todos los relojes haya contado
			System.out.println("Termine " + getInitialTime());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < getMaxVuelta(); i++) {
			esperarXsegundos(getInitialTime());
		}
	}
}
