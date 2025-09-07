package ejercicio05.main;

import java.time.LocalDate;

import ejercicio05.model.Persona;

public class Main {
    public static void main(String[] args) {
        
        //Carga de datos
        Persona persona1 = new Persona();
        persona1.setDni("37508681");
        persona1.setNombre("Matias Leandro Ruben");
        persona1.setFechaNac(LocalDate.of(1993, 4, 1));
        persona1.setProvincia("Jujuy");


        //Constructor por defecto
        Persona persona2 = new Persona(
             "42854962",
             "Carlos",
            LocalDate.of(2005, 8, 25),
             "Jujuy"
        );

        //Constructor parametrizado
        Persona persona3 = new Persona(
            "35489642",
            "Juan",
            LocalDate.of(1985, 8, 20)
        );

        //Constructor parametrizado
        persona1.mostrarDatos();
        System.out.println("---------------");

        persona2.mostrarDatos();
        System.out.println("---------------");

        persona3.mostrarDatos();
    }
    
}
