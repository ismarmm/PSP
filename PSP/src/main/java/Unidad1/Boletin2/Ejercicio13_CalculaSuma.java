package Unidad1.Boletin2;

public class Ejercicio13_CalculaSuma  {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(args[0]);
		
		if(numero % 2 == 0) {
			
			System.out.println("El numero es par");
			
			int suma = 0;
			
			for(int i = 0; i <= numero; i++) {
			    suma += i;
			}
			
			System.out.println("Numero original: " + numero);
			System.out.println("Suma total: " + suma);
			
		}
		
		else if(numero % 2 != 0) {
					
					System.out.println("El numero es impar");
					
					int suma = 0;
					
					for(int i = 0; i <= numero; i++) {
					    suma += i;
					}
					
					System.out.println("Numero original: " + numero);
					System.out.println("Suma total: " + suma);
		}
	}
}


