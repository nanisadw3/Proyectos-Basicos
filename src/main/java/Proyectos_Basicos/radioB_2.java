package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class radioB_2 {

    public static void main(String[] args) {

        Marco_r_2 m = new Marco_r_2();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}

class Marco_r_2 extends JFrame {

    public Marco_r_2() {
        setSize(500, 350);
        setVisible(true);
        setTitle("Radio buton 2");
        Lamina_r_2 l = new Lamina_r_2();
        add(l);
    }
}

class Lamina_r_2 extends JPanel {

    private JLabel etiqueta_1;
    private ButtonGroup grupo_1;
    private JPanel lamina_rad;

    public Lamina_r_2() {

        setLayout(new BorderLayout());
        etiqueta_1 = new JLabel("En un lugar de la mancha...");
        etiqueta_1.setFont(new Font("CascadiaCode", Font.PLAIN, 12));

        grupo_1 = new ButtonGroup();//inicializamos el grupo
        lamina_rad = new JPanel();//inicializo la lamina
        
        crear_r("Chico", false, 10);
        crear_r("Mediano", true, 12);
        crear_r("Grande", false, 15);
        crear_r("Muy grande", false, 25);

        add(lamina_rad, BorderLayout.SOUTH);
        add(etiqueta_1, BorderLayout.CENTER);

    }

    private void crear_r(String nombre, boolean seleccionado, int tamano) {

        JRadioButton rad = new JRadioButton(nombre, seleccionado);

        
        
        grupo_1.add(rad);//todos los botones al grupo
        lamina_rad.add(rad);

        rad.addActionListener(new Evento_rad(tamano));//asignamos la accion pasando le por parametros al contructor el tamano
    }

    private class Evento_rad implements ActionListener {

        private int tamano;

        @Override
        public void actionPerformed(ActionEvent e) {
            etiqueta_1.setFont(new Font("CascadiaCode", Font.PLAIN, tamano));
        }

        public Evento_rad(int tamano) {//constructor
            this.tamano = tamano;
        }

    }

}
