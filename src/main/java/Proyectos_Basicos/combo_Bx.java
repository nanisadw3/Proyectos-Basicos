package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class combo_Bx {

    public static void main(String[] args) {
        Marco_Bx m = new Marco_Bx();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setVisible(true);
    }
}

class Marco_Bx extends JFrame {

    public Marco_Bx() {
        setTitle("Combo");
        setSize(550, 400);
        Lamina_Bx l = new Lamina_Bx();
        add(l);
    }
}

class Lamina_Bx extends JPanel {

    private JLabel etiqueta_1;
    private JComboBox combo_1;

    public Lamina_Bx() {
        setLayout(new BorderLayout());
        etiqueta_1 = new JLabel("En un lugar de la mancha...");

        etiqueta_1.setFont(new Font("Cascadia Code", Font.PLAIN, 18));
        add(etiqueta_1, BorderLayout.CENTER);

        JPanel lamina_bx_2 = new JPanel();
        combo_1 = new JComboBox();
        combo_1.setEditable(true);//edite el texto del combo
        //elementos
        combo_1.addItem("Cascadia Code");
        combo_1.addItem("Serif");
        combo_1.addItem("Arial");
        
        Evento_bx e = new Evento_bx();
        combo_1.addActionListener(e);
        
        lamina_bx_2.add(combo_1);
        add(lamina_bx_2, BorderLayout.NORTH);

    }

    private class Evento_bx implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            etiqueta_1.setFont(new Font((String) combo_1.getSelectedItem(), Font.PLAIN, 18));
            //refundicion del get selected item, por que es de tipo object
        }

    }
}
