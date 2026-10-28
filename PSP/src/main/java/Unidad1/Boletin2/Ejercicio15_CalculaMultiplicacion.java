package Unidad1.Boletin2;

public class Ejercicio15_CalculaMultiplicacion {

	public static void main(String[] args) {

		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);

		long resultado = 1;

		for (int i = numero1; i <= numero2; i++) {
			resultado = resultado * i;
		}

		System.out.println("Resultado de multiplicar de " + numero1 + " a " + numero2 + " = " + resultado);
	}
}