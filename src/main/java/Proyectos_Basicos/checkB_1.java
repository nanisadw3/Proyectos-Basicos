package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class checkB_1 {

    public static void main(String[] args) {
        Marco_ch_1 m = new Marco_ch_1();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
}

class Marco_ch_1 extends JFrame {

    public Marco_ch_1() {
        setTitle("Check box 1");
        setSize(550, 350);
        Lamina_ch_1 l = new Lamina_ch_1();
        add(l);
    }
}

class Lamina_ch_1 extends JPanel {

    private JLabel texto;
    private JCheckBox check_1, check_2;

    public Lamina_ch_1() {

        setLayout(new BorderLayout());

        Font letra = new Font("Serif", Font.PLAIN, 24);

        texto = new JLabel("En un luguar de la mancha cuyo nombre...");
        texto.setFont(letra);//le pasamos el estilo de letra

        JPanel lamina_texto = new JPanel();
        lamina_texto.add(texto);//agregamos el texto a la lamina 
        add(lamina_texto, BorderLayout.CENTER);

        check_1 = new JCheckBox("Negrita");
        check_2 = new JCheckBox("Cursiva");

        Eventos acciones = new Eventos();//instancia

        check_1.addActionListener(acciones);
        check_2.addActionListener(acciones);

        JPanel lamina_check = new JPanel();

        lamina_check.add(check_1);
        lamina_check.add(check_2);

        add(lamina_check, BorderLayout.SOUTH);

    }

    private class Eventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int tipo = 0;

            if (check_1.isSelected()) {//is selected te devuelve true o false
                tipo += Font.BOLD;//le suma 1 por que para poner "bold" vale 1
            }
            if (check_2.isSelected()) {
                tipo += Font.ITALIC;//le suma 2 por que ese es el valor de italic
            }
            
            texto.setFont(new Font("Serif", tipo, 24));//le pasamos a la lavel el tipo de letra que fue seleccionado 

        }

    }
}
