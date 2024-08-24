package Proyectos_Basicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class text_a_1 {

    public static void main(String[] args) {

        Marco_a_1 m = new Marco_a_1();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
    }
}

class Marco_a_1 extends JFrame {

    public Marco_a_1() {

        setTitle("Text Area");
        setSize(500, 350);
        Lamina_a_1 l = new Lamina_a_1();
        add(l);
    }
}

class Lamina_a_1 extends JPanel {

    private JTextArea area;

    public Lamina_a_1() {

        area = new JTextArea(8, 20);
        area.setLineWrap(true); // No se ensancha 

        JScrollPane lamina_area = new JScrollPane(area); // Incluyes en los paréntesis al objeto que quieres 

        JButton btn = new JButton("Consola");
        consola accion = new consola();
        btn.addActionListener(accion);
        add(btn);
        add(lamina_area);
    }

    private class consola implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Utiliza la variable de instancia area
            System.out.println(area.getText());
        }

    }
}
