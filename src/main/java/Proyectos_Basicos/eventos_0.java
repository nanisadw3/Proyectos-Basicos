package Proyectos_Basicos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class eventos_0 {

    public static void main(String[] args) {
        Marco_boton m = new Marco_boton();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }

}
//marco
class Marco_boton extends JFrame{
    public Marco_boton(){
        
        setTitle("Eventos_0");
        setSize(500,300);
        Lamina_boton l = new Lamina_boton();
        add(l);
        l.setBackground(Color.darkGray);//cambias el color de la lamina
        
    }
}

//Lamina
class Lamina_boton extends JPanel implements ActionListener{
        JButton bt_1 = new JButton("Azul");
        JButton bt_2 = new JButton("Rojo");
        JButton bt_3 = new JButton("berde");

    public Lamina_boton(){
        add(bt_1);
        add(bt_2);
        add(bt_3);
        bt_1.addActionListener(this);//ponemos el boton a la escucha 
        bt_2.addActionListener(this);
        bt_3.addActionListener(this);
    }
//metodo abstracto
    @Override
    public void actionPerformed(ActionEvent e) {//accion dee ste boton

        Object botonPulsado = e.getSource();//para saver que botonfuepulsado
        
        if (botonPulsado == bt_1) {
        setBackground(Color.blue);

        }else if (botonPulsado == bt_2) {
        setBackground(Color.red);

        }else if (botonPulsado == bt_3) {
            setBackground(Color.green);
        }

    }
}