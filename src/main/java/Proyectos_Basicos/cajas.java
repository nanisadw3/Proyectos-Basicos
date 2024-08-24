
package Proyectos_Basicos;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cajas {
    public static void main(String[] args) {
        Marco_Cs m = new Marco_Cs();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }
}
class Marco_Cs extends JFrame{
    public Marco_Cs(){
        setTitle("Disposicion cajas");
        setSize(200,200);
        JLabel etiqueta_1 = new JLabel("Nombre: ");
        JTextField texto_1 = new JTextField(10);
        texto_1.setMaximumSize(texto_1.getPreferredSize());
    
        //primer caja
        Box caja_H1 = Box.createHorizontalBox();//contenedor horizontal
        caja_H1.add(etiqueta_1);
        caja_H1.add(Box.createHorizontalStrut(10));
        caja_H1.add(texto_1);
        //
        //caja 2
        JLabel etiqueta2 = new JLabel("Contrasena");
        JTextField texto2 = new JTextField(10);
        texto2.setMaximumSize(texto2.getPreferredSize());
        
        Box cajaH2 = Box.createHorizontalBox();
        cajaH2.add(etiqueta2);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(texto2);
        //
        //caja 3
        JButton btn1 = new JButton("OK");
        JButton btn2 = new JButton("Canselar");
        
        Box cajaH3 = Box.createHorizontalBox();
        cajaH3.add(btn1);
        cajaH3.add(Box.createGlue());
        cajaH3.add(btn2);
        //
        Box cajaPadre = Box.createVerticalBox();
        cajaPadre.add(caja_H1);
        cajaPadre.add(cajaH2);
        cajaPadre.add(cajaH3);
        add(cajaPadre);
    }
}

