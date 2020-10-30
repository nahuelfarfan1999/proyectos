package condicional;

import java.util.Scanner;
        
public class Condicional {

    public static void main(String[] args) {
        
        boolean haceSol = true;
        boolean nevando = true;
        int temperatura = 27;
        Scanner leer = new Scanner(System . in);
        
        if(temperatura > 25){
            System.out.print("A la playa !!!");
        }
 
    
        
        if (haceSol == true) {
            System.out.print("No te olvides la sombrilla");
        } 
        
        
        if (nevando || haceSol ) {
            System.out.print("Que bien!");
        }
        
        // TODO code application logic here
    }
    
}
