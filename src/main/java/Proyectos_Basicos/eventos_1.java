package Proyectos_Basicos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class eventos_1 {

    public static void main(String[] args) {
        Marco_botonD m = new Marco_botonD();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }

}
//marco

class Marco_botonD extends JFrame {

    public Marco_botonD() {

        setTitle("Eventos_0");
        setSize(500, 300);
        Lamina_botonD l = new Lamina_botonD();
        add(l);
        l.setBackground(Color.darkGray);//cambias el color de la lamina

    }
}

//Lamina
class Lamina_botonD extends JPanel {

    JButton bt_1 = new JButton("Azul");
    JButton bt_2 = new JButton("Rojo");
    JButton bt_3 = new JButton("berde");

    public Lamina_botonD() {
        add(bt_1);
        add(bt_2);
        add(bt_3);
        fondo berde = new fondo(Color.green);//instancias
        fondo azul = new fondo(Color.blue);
        fondo rojo = new fondo(Color.red);
        bt_1.addActionListener(azul);//ponemos el boton a la escucha 
        bt_2.addActionListener(rojo);
        bt_3.addActionListener(berde);
    }
    //clase interrna

    class fondo implements ActionListener {

        private Color colorDeFondo;

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDeFondo);//para la lamina
        }

        public fondo(Color c) {
            colorDeFondo = c;
        }
    }

}
