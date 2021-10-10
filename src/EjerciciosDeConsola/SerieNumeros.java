package EjerciciosDeConsola;
import java.util.Scanner;

public class SerieNumeros {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a=1;
        int b=2;
        int c=0;
        int iterador=1;
        int s=0;
        
        System.out.println("Por favor, Ingrese el vaor de 'a'");
        a= scan.nextInt();        
        
        System.out.println("Ahora, Ingrese el valor de'b'");
        b= scan.nextInt();
        
        System.out.println("Por ultimo, ingrese la cantidad de iteraciones que desee.");
        c=scan.nextInt();
        
        System.out.println("Estos son los resultados de tu serie de numeros:");
        while(iterador<=c){
            s=a+b;
            System.out.println(s);

            a=b;
            b=s;
            iterador++;
        }
        
        scan.close();

	}

}
