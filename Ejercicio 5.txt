package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System . in);
        
        String Nombre;
        String Apellido;
        String DNI;
        int Año;
        int Edad;
        
        System.out.print("---Bienvenido al formulario del cliente---");
        System.out.print("Nombre:");
        Nombre = leer.nextLine();
        System.out.print("Apellido:");
        Apellido = leer.nextLine();
        System.out.print("DNI:");
        DNI = leer.nextLine();
        System.out.print("Año:");
        Año = leer.nextInt();
        System.out.print("--Gracias por venir--");
        System.out.print("-------------------------");
        
        Edad = 2020 - Año;
        
        System.out.print("----Sus datos son----");
        System.out.print("----Nombre:" + Nombre);
        System.out.print("----Apellido:" + Apellido);
        System.out.print("---DNI:" + DNI );
        System.out.print("---Edad:" + Edad);
   
        
        // TODO code application logic here
    }
    
}

