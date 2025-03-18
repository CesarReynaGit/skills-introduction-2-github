 // Función que genera un arreglo de 10 números aleatorios enteros

import java.util.Random;

public class HolaMundo {

    public static int[] generarNumerosAleatorios(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(100); // Genera números entre 0 y 99
            System.out.println("Numero: " + numeros[i]);
        }
        return numeros;
    }

    // Función que suma los elementos de un arreglo
    public static int sumarElementos(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = generarNumerosAleatorios(5);
        int suma = sumarElementos(numeros);
        System.out.println("La suma de los elementos es: " + suma);
    }
}