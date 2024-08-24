package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class layouts {

    public static void main(String[] args) {
        Marco_La m = new Marco_La();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Marco_La extends JFrame {

    public Marco_La() {
        setSize(600, 300);
        setTitle("Layouts");
        setLocationRelativeTo(null);
        layout_d l = new layout_d();
        Lamina_La la = new Lamina_La();
        add(la, BorderLayout.NORTH);
        add(l,BorderLayout.SOUTH);
        
    }
}

class Lamina_La extends JPanel {

    public Lamina_La() {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton a = new JButton("Amarillo");
        JButton z = new JButton("Azul");

        add(z, BorderLayout.NORTH);
        add(a, BorderLayout.EAST);

    }

}

class layout_d extends JPanel {

    public layout_d() {

        setLayout(new BorderLayout());//este layout es diferente
        
        JButton r = new JButton("Rojo");
        JButton v = new JButton("Verde");
        JButton g = new JButton("negro");

        add(r, BorderLayout.WEST);
        add(v, BorderLayout.CENTER);
        add(g, BorderLayout.EAST);

    }
}
