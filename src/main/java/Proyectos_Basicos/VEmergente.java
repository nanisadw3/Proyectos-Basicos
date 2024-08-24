package Proyectos_Basicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VEmergente {

    public static void main(String[] args) {

        Marco_VE m = new Marco_VE();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}

class Marco_VE extends JFrame {

    public Marco_VE() {

        setSize(400, 250);
        setTitle("Ventanas emergentes");
        Lamina_VE l = new Lamina_VE();
        add(l);
    }

}

class Lamina_VE extends JPanel {

    JButton bt_1;
    JButton bt_2;
    JButton bt_3;
    JButton bt_4;

    public Lamina_VE() {

        bt_1 = new JButton("Botton 1");
        bt_2 = new JButton("Bortton 2");
        bt_3 = new JButton("Botton 3");
        bt_4 = new JButton("Botton 4");

        bt_1.addActionListener(new Accion_b());
        bt_2.addActionListener(new Accion_b());
        bt_3.addActionListener(new Accion_b());
        bt_4.addActionListener(new Accion_b());

        add(bt_1);
        add(bt_2);
        add(bt_3);
        add(bt_4);
    }

    private class Accion_b implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == bt_1) {
                //JOptionPane.showMessageDialog(Lamina_VE.this, "Mensaje de prueva");
                JOptionPane.showMessageDialog(Lamina_VE.this, "Prueva", "Advertencia", 3);
            } else if (e.getSource() == bt_2) {
                JOptionPane.showInputDialog(Lamina_VE.this, "Ingresa algo", "Input", 2);
            } else if (e.getSource() == bt_3) {
                JOptionPane.showConfirmDialog(Lamina_VE.this, "Elije:", "Confirm Dialog", 1);
            } else if (e.getSource() == bt_4) {
                JOptionPane.showOptionDialog(Lamina_VE.this, "Elije", "Option Dialog", 2, 2, null, null, null);
            }

        }

    }

}
