package suma;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		//nuevo cambio desde local
		suma();
	}
	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

	public static void suma() {
		int a,b, resultado;
		String respuesta="s";
	try {
		
		Scanner teclado =new Scanner(System.in);
		while (respuesta=="s"){
			System.out.println("Introduce un número positivoo:");
			a=teclado.nextInt();
			System.out.println("Introduce otro número positivoo:");
			//nuevo comentario de prueba
			//nueuvp
			b=teclado.nextInt();
			if ((a > 0) && (b >0)) {
				resultado= a+b;
				System.out.println("El resultado es " + resultado);
				
			}
			else {
				System.out.println("No son positivos");
			}
			System.out.println("¿¿¿¿Quieres seguir sumando??? s/n");
			respuesta=teclado.next();
			//aaaaaaaaaa
			//aaaaaaaaaaaaaaaaa
			//aaaaaaaaaaa
			//aaaaaaaaa
			//aaaaaaaa
		}
		teclado.close(); //estamos modificando en la rama de desarrollo
	}
	catch(Exception ex)
	{
		System.out.println("error");
	}
		
	}
}
