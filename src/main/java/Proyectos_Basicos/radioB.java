package Proyectos_Basicos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class radioB {

    public static void main(String[] args) {
        Marco_rB m = new Marco_rB();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Marco_rB extends JFrame {

    public Marco_rB() {
        setSize(500, 300);
        setTitle("Radio Button");
        Lamina_rB l = new Lamina_rB();
        add(l);
    }
}

class Lamina_rB extends JPanel {

    String[] colores = {"Azul", "Rojo", "Verde"};

    public Lamina_rB() {

        ButtonGroup grupo_1 = new ButtonGroup();
        ButtonGroup grupo_2 = new ButtonGroup();

        JRadioButton rad_1 = new JRadioButton("Azul", true);
        JRadioButton rad_2 = new JRadioButton("Verde", false);
        JRadioButton rad_3 = new JRadioButton("Rojo", false);
        grupo_1.add(rad_3);
        grupo_1.add(rad_2);
        grupo_1.add(rad_1);

        add(rad_1);
        add(rad_2);
        add(rad_3);

        JRadioButton rad_4 = new JRadioButton("Masculino", false);
        JRadioButton rad_5 = new JRadioButton("Femenino", false);
        grupo_2.add(rad_4);
        grupo_2.add(rad_5);

        add(rad_4);
        add(rad_5);

    }
}
