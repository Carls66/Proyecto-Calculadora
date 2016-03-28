/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author JrCarlosAlberto
 */
public class Teclas implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
        int tecla = ke.getKeyCode();        
        System.out.println(tecla);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
        char te = ke.getKeyChar();
        
        if (te == 1) {
            JOptionPane.showInputDialog("hola");
            
            
        }
        
    }
    
    
    
    
}
