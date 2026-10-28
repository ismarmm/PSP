package Sumas;

public class CalculaSuma {
    public static void main(String[] args) {
        String tipo = args[0];
        int numero = Integer.valueOf(args[1]);
        CalculaSuma calculadora = new CalculaSuma();
        calculadora.sumar(tipo, numero);
    }

    public void sumar(String tipo, int numero) {
        int suma = 0;

        for (int i = 0; i <= numero; i++) {
            if (tipo.equals("par") && i % 2 == 0) {
                suma = suma + i;
            }
            else if (tipo.equals("impar") && i % 2 != 0) {
                suma = suma + i;
            }
        }

        System.out.println(suma);
    }

}
