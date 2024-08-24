package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class texto_4 {
    public static void main(String[] args) {
        
        Marco_t_4 m = new Marco_t_4();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
    }
    
}

class Marco_t_4 extends JFrame{
    public Marco_t_4(){
        setTitle("Texto 4");
        setSize(550,400);
        Lamina_t_4 l = new Lamina_t_4();
        add(l);
    }
}
class Lamina_t_4 extends JPanel{
    
    JTextField txt_usr = new JTextField(15);
        JPasswordField txt_contra = new JPasswordField(15);
    
    public Lamina_t_4(){
        setLayout(new BorderLayout());
        JPanel lamina_2 = new JPanel();
        lamina_2.setLayout(new GridLayout(2,2));//dos filas y dos columnas
        add(lamina_2,BorderLayout.NORTH);
        JLabel etiqueta1= new JLabel("Usuario");
        JLabel etiqueta2= new JLabel("Contrasena");
        
        //escucha
        comprueva_pas accion = new comprueva_pas();
        txt_contra.getDocument().addDocumentListener(accion);

        //
        lamina_2.add(etiqueta1);
        lamina_2.add(txt_usr);
        lamina_2.add(etiqueta2);
        lamina_2.add(txt_contra);
        
        JButton btn = new JButton("Enviar");
        add(btn,BorderLayout.SOUTH);
    }
    private class comprueva_pas implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
        
            char [] contrta;
            contrta = txt_contra.getPassword();
            if(contrta.length<8||contrta.length>12){
                txt_contra.setBackground(Color.red);
                txt_usr.setBackground(Color.red);
            }else{
                txt_contra.setBackground(Color.white);
                txt_usr.setBackground(Color.white);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
        char [] contrta;
            contrta = txt_contra.getPassword();
            if(contrta.length<8||contrta.length>12){
                txt_contra.setBackground(Color.red);
                txt_usr.setBackground(Color.red);
            }else{
                txt_contra.setBackground(Color.white);
                txt_usr.setBackground(Color.white);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        
        }
        
    }
}