package EjerciciosDeConsola;

public class Cuestionario {

	public static void main(String[] args) {
		int suma=0;
		int[] vector = new int[3];
		double promedio=0;
		
		vector[0] = 85;
		vector[1]=90;
		vector[2]=95;
		
		for(int x=0; x<=3; x++) {
			suma= suma+ vector[x];
		}
		promedio = suma/3;
		
		System.out.println("La suma es: "+suma);
		System.out.println("El promedio es: "+promedio);
		
	}

}
