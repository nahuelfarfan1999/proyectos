
package ejercicio11;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ejercicio11 {

    
    public static void main(String[] args) {
        
        // Carga de Vectores
       ImageIcon Bien = new ImageIcon("src/Ejercicio11/Bien.png");
       ImageIcon Mal = new ImageIcon("src/Ejercicio11/Mal.png");
       String [] marcas = { "   " , " Ford " , " Fiat " , " Renault " };
       String [] Ford  = { " Fiesta " , " Falcon " , " Ka " , " Focus " };
       String [] Fiat  = { " 1500 " , " Palio " , " Punto " , " Cubo " };
       String [] Renault  = { " Clio " , " Sandero " , " 12 " , " Kwind " };
       // Seleccion de marca
       Object opcion =  JOptionPane . showOptionDialog ( null , " Seleccione una marca de vehiculo " , " Mi coche " , JOptionPane . QUESTION_MESSAGE , null , marcas, marcas [ 0 ]);
       
         
        }
        // mostrar el combo de los modelos seguin la marca
    
         private static void combomodelos ( String [] Ford , String [] Fiat , String [] Renault , Object Opcion, String opcion, Icon Bien, Icon Mal ) {  
      
            
        
            if (opcion == "Ford" ) {
                Object fordmodelo =  JOptionPane . showInputDialog ( null , " Los modelos para la marca   "  + opcion +  " Seleccione el modelo que le guste " , " Modelos de Autos " , JOptionPane . QUESTION_MESSAGE , null , Ford , Ford [ 0 ]);
                System . out . println ( " Su vehiculo es de la marca "  + opcion +  " modelo "  + fordmodelo);
            
            
            }
            if (opcion == "Ford") {
              JOptionPane.showMessageDialog(null,"MUY BIEN", "Mi coche",JOptionPane.INFORMATION_MESSAGE,Bien); 
            } 
            else
            { 
             JOptionPane.showMessageDialog(null,"MUY MAL", "Mi coche",JOptionPane.INFORMATION_MESSAGE,Mal);
                
            }
            
                 
        } 
        
    
    
            
    
    
     
        
}       
        
        // TODO code application logic here
    
    

