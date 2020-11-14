
package boletin;

import java.util.Scanner;

public class Boletin {

    public static void main(String[] args) {
        
        
        String alumno ;
        String Fechadenacimiento;
        int Dni;
        
        
        Scanner leer = new Scanner(System . in);
        
        System.out.print("Ingresar el nombre del alumno:");
        alumno = leer.nextLine();
        System.out.print(" Ingresar la Fecha de nacimiento:");
        Fechadenacimiento = leer.nextLine();
        System.out.print(" Ingresar el Dni:");
        Dni = leer.nextInt();
        
        System.out.print("Por favor ingresar el numero de  materias:");
        int nmaterias = leer.nextInt();
        
        String materias []  = new String [nmaterias];
        int notas [] [] = new int [nmaterias][3];
        int mnotas = notas[0].length;
        float promedios[]= new float[nmaterias];
        
            
           for (int i=0;i<nmaterias;i++){
            System.out.print(+ (i+1)+"/"+ nmaterias +"  Ingresar el nombre de la materia : ");
            materias[i]=leer.next();
                 
        //solicitar materias 
        for(int j=0;j<mnotas;j++){
            do{
            System.out.print((j+1)+"  Ingresar la nota (con decimales):");
            notas[i][j]= leer.nextInt();
            }while(notas[i][j]<=0 || notas[i][j]>15);
            promedios[i]+= notas [i][j] ;
        }
            promedios[i]/=3;
        }
          
            
        
        
        // Imprimir la ficha del alumno
        
        System.out.print("------------------------------------");
        System.out.print("---------Boletin del alumno---------");
        System.out.print("-------Alumno: + alumno-----------");
        System.out.print("-------Fechadenacimiento: + Fechadenacimiento----------" );
        System.out.print("-------Dni: + Dni-----------");
        System.out.print("----------------------------");
        
         for(int i=0;i<nmaterias;i++){
              System.out.println("===" +materias[i]+ "===");
            for (int j=0;j<mnotas;j++){
            System.out.println(" ="+(j+1)+"= "+notas[i][j]+" ===" );
            }
       
         
       
        System.out.println("================================================");
        System.out.println("Promedio: " +Math.round(promedios[i]));
        System.out.println("================================================");
        System.out.println("================================================");     
        }
    }
}
    

      






        
    
        
  

// TODO code application logic here
                
    
                 

  
                


        