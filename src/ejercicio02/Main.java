package ejercicio02;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
    
      Scanner scanner=new Scanner (System.in);
      System.out.print("Ingrese un número: ");
      int numero = scanner.nextInt();
      if (numero % 2 == 0) {
          System.out.print("El número ingresado es PAR. El doble es: " + (numero * 2 ));
       } else {
         System.out.print("El número ingresado es IMPAR. El triple es: " + (numero * 3 ));
       }
   } 
}