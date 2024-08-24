package Proyectos_Basicos;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class grafics_0 {

    public static void main(String[] args) {
        Marco m = new Marco();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
}
//creacion del marco 

class Marco extends JFrame {

    public Marco() {
        setTitle("Marco_0");
        setSize(500, 300);
        Lamina l = new Lamina();
        add(l);
    }
}
//lamina

class Lamina extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("texto", 100, 100);
    }
}

