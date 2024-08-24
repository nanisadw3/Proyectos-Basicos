package Proyectos_Basicos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class texto_2 {

    public static void main(String[] args) {
        Marco_text_2 m = new Marco_text_2();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Marco_text_2 extends JFrame {

    public Marco_text_2() {
        setTitle("Texto 2");
        setSize(500, 350);
        Lamina_text_2 l = new Lamina_text_2();
        add(l);
    }
}

class Lamina_text_2 extends JPanel {

    public Lamina_text_2() {
        JTextField text = new JTextField(20);
        add(text);
    }
}
