package EjerciciosDeInterfaz;

import javax.swing.JProgressBar;

public class ProgresoHilo implements Runnable{
	private JProgressBar barra;
	
	public ProgresoHilo (JProgressBar barraVentana) {
		this.barra=barraVentana;
	}
	
	public void run() {
		while(!Hilo.terminado) {
			barra.setValue(Hilo.progreso);
			barra.repaint();
			
			if(Hilo.terminado) {
				barra.setValue(100);
				
				break;
			}
		}
		
	}
	
}
