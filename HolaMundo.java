 // Función que genera un arreglo de 10 números aleatorios enteros

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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
        int[] numeros = generarNumerosAleatorios(20);
        int suma = sumarElementos(numeros);
        Set<Integer> repetidos = encontrarRepetidos(numeros);

        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El menor número es: " + encontrarMenor(numeros));
        System.out.println("Los números repetidos son: " + repetidos);
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0]; // Asume que el primer elemento es el menor
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero; // Actualiza el menor si encuentra un valor más pequeño
            }
        }
        return menor;
    }

    public static Set<Integer> encontrarRepetidos(int[] numeros) {
    Set<Integer> elementosUnicos = new HashSet<>();
    Set<Integer> elementosRepetidos = new HashSet<>();

    for (int numero : numeros) {
        if (!elementosUnicos.add(numero)) {
            elementosRepetidos.add(numero); // Si no se puede agregar, es un repetido
        }
    }

    return elementosRepetidos;
}
}