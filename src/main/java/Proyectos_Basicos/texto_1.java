package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class texto_1 {

    public static void main(String[] args) {

        Marco_text m = new Marco_text();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);

    }

}

class Marco_text extends JFrame {

    public Marco_text() {

        setTitle("texto_1");
        setSize(600, 350);

        Lamina_text l = new Lamina_text();
        add(l);

    }
}

class Lamina_text extends JPanel {

    JTextField campo_1 = new JTextField(20);
    JLabel resultado = new JLabel("", JLabel.CENTER);//ponemos el texto en el centro

    public Lamina_text() {

        setLayout(new BorderLayout());
        JPanel lamina_2 = new JPanel();
        lamina_2.setLayout(new FlowLayout());

        JButton bt_1 = new JButton("Comprobar");
        JLabel texto_1 = new JLabel("Ingresa el Gmail");
        dame_texto accion = new dame_texto();//intancia de la classe que asigna la accion
        bt_1.addActionListener(accion);//boton a la escucha
        lamina_2.add(texto_1);
        lamina_2.add(campo_1);
        lamina_2.add(bt_1);
        add(lamina_2, BorderLayout.NORTH);
        add(resultado, BorderLayout.CENTER);

    }

    private class dame_texto implements ActionListener {

        private String gmail;
        int correcto = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            gmail = campo_1.getText().trim();
            for (int i = 0; i < gmail.length(); i++) {

                if (gmail.charAt(i) == '@') {//charAt divide por caracteres
                    correcto++;
                }

            }
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "El gemail es correcto");
                resultado.setText("Correcto");
            } else {
                JOptionPane.showMessageDialog(null, "El gemail es incorrecto");
                resultado.setText("Incorrecto");
            }
            correcto = 0;
        }

    }
}
