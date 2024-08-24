package Proyectos_Basicos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fuentes_1 {

    public static void main(String[] args) {
        Marco_f_1 m = new Marco_f_1();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
    }
}

class Marco_f_1 extends JFrame {

    public Marco_f_1() {
        setTitle("Fuentes");
        setSize(600, 300);
        Lamina_f_1 l = new Lamina_f_1();
        add(l);
    }
}

class Lamina_f_1 extends JPanel {

    public Lamina_f_1() {
        //add(bt_1);
        //add(bt_2);
        //add(bt_3);
        //JButton bt_1 = new JButton("Amarillo");
        //JButton bt_2 = new JButton("Rojo");
        //JButton bt_3 = new JButton("Azul    ");

        accionLamina azul = new accionLamina("Azul", new ImageIcon("C:/Users/inaki/Downloads/Azul.png"), Color.blue);
        accionLamina amarillo = new accionLamina("Amarillo", new ImageIcon("C:/Users/inaki/Downloads/Amariyo.png"), Color.yellow);
        accionLamina rojo = new accionLamina("Rojo", new ImageIcon("C:/Users/inaki/Downloads/Rojo.png"), Color.red);
        //instancias para cada color 

        JButton bt_1 = new JButton(azul);//podemos poner la instancia
        add(bt_1);
        JButton bt_2 = new JButton(rojo);
        add(bt_2);
        JButton bt_3 = new JButton(amarillo);
        add(bt_3);

    }
//clase interna para usar el metodo set background 
    private class accionLamina extends AbstractAction {

        public accionLamina(String nombre, Icon icono, Color color_B) {

            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "poner la lamina de color " + color_B);

            //Asigna el valor de cada boton
            //pasar obligatoriamente lo que le mandes por parametros
            //objetos
            putValue("color", color_B);
            //kay X 
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //casteamos
            Color c = (Color) getValue("color");//el mismo kay que tiene el color_B
            setBackground(c);
        }

    }

}
