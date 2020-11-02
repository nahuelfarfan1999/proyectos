
package JOptionPane;

import javax.swing.JOptionPane;

public class UsuarioyContraseña {

    public static void main(String[] args) {
        
        String usuario,contraseña;
        String user = "Nahuel Farfan";
        String pass = "nahu439";
        
        usuario = JOptionPane.showInputDialog("Ingrese el nombre de Usuario:  ");
        contraseña = JOptionPane.showInputDialog("Ingrese la contraseña del" + usuario + " :");
        
        if(usuario.equals(user) && contraseña.equals(pass)){
            JOptionPane.showMessageDialog(null,"Buenas tardes " + user );
            }else {
            JOptionPane.showMessageDialog(null,"el Usuario y contraseña brindada no es correcta","Error credenciales",JOptionPane.ERROR_MESSAGE);
        
        
    }
    
}
}