
package vectores;

import java.util.Scanner;

public class Vectores {

    
    public static void main(String[] args) {
        
       // crear vector
        String nombre [] =  new String [ 5 ];
        int edad [] = new int [5];
        String sexo [] = new String [5];
        
        // cargar vector
        
        nombre [0] = "Diana";
        nombre [1] = "Juan";
        nombre [2] = "Matias";
        nombre [3] = "Luis";
        nombre [4] = "Facundo";
        
        edad [0] = 23;
        edad [1] = 19;
        edad [2] = 62;
        edad [3] = 35;
        edad [4] = 22;
        
        sexo [0] = "femenina";
        sexo [1] = "masculino";
        sexo [2] = "masculino";
        sexo [3] = "masculino";
        sexo [4] = "masculino";
        
        
        
        // imprimir o recorrer vector de manera dinámica
        
        
        for ( int i = 0 ; i < nombre.length; i ++ ) {
            System . out . println ( " Posicion del vector es "  + nombre [i] + edad [i] + sexo[i]);
        }
        
        
        // TODO code application logic here
    }
    
}
