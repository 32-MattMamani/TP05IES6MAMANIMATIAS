package ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero;
        int resultado;
        System.out.println("Ingresar un número entre el 1 y el 9");
        numero = scanner.nextInt();
        for (int contador = 1; contador<=10; contador ++){
            resultado = numero*contador;
            System.out.println(numero + "x" + contador + "=" + resultado);
        }
    }

}