package Proyectos_Basicos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class eventos_6 {

    public static void main(String[] args) {
        Marco_eventos6 m = new Marco_eventos6();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Marco_eventos6 extends JFrame {

    public Marco_eventos6() {
        setSize(600, 450);
        lamina_eventos6 l = new lamina_eventos6();
        add(l);
    }
}

class lamina_eventos6 extends JPanel {

    public lamina_eventos6() {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);//sin layout colocacion
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();

        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);

        add(cuadro1);
        add(cuadro2);
        
        foco f = new foco();
        cuadro1.addFocusListener(f);//ponecos a cuadro1 a la escucha 
    }
    
    private class foco implements FocusListener{//clase interna para acceder a los Jtext

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("se gano el foco");
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("se perdio el foco");
    }
    
}

    JTextField cuadro1;
    JTextField cuadro2;
}

