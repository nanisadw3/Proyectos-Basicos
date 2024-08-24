
package Proyectos_Basicos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class texto_3 {
    public static void main(String[] args) {
        Marco_t_3 m = new Marco_t_3();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        
    }
    
}
class Marco_t_3 extends JFrame{

    public Marco_t_3(){
        setTitle("Texto 3");
        setSize(500,350);
        Lamina_t_3 l = new Lamina_t_3();
        l.setBackground(Color.darkGray);
        add(l);
        
    }
}
class Lamina_t_3 extends JPanel{
    public  Lamina_t_3(){
        
        JTextField text = new JTextField(20);
        Document doc = text.getDocument();//ponemos a la escucha el texto que esta en el campo de texto 
        escucha_texto accion = new escucha_texto();
        doc.addDocumentListener(accion);
        add(text);
        
    }
    //clase interna provada
    private class escucha_texto implements DocumentListener{

        //metodos de la interfaz
        @Override
        public void insertUpdate(DocumentEvent e) {//inserta 
            System.out.println("Insertaste texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Borraste texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            //si cambia de formato el texto
        }
        
    }

}
