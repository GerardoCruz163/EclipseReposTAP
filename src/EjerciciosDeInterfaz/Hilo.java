package EjerciciosDeInterfaz;

public class Hilo implements Runnable {
	public static boolean terminado=false;
	public static int progreso=0;
	public String nombreHilo;
	
	public Hilo(String nombre) {
		this.nombreHilo=nombre;
	}
	
	public void run() {
		terminado =false;
		for(int i=1; i<100; i++) {
			progreso=i;
			
			try {
			Thread.sleep(80);
			}catch(InterruptedException e) {
				System.out.println("Hilo interrumpido");
			}
		}
		terminado=true;
	}
}
