package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class barra_de_Erramintas {  // Corrección del nombre de la clase

    public static void main(String[] args) {
        MarcoEr m = new MarcoEr();  // Corrección del nombre de la clase
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
}

class MarcoEr extends JFrame {

    private JPanel lamina;

    public MarcoEr() {
        setTitle("Barra de herramientas");
        setSize(600, 300);

        lamina = new JPanel();
        add(lamina);

        Action azul = new AccionC("azul", Color.BLUE, new ImageIcon("C:/Users/inaki/Pictures/Azul.png"));
        Action rojo = new AccionC("rojo", Color.RED, new ImageIcon("C:/Users/inaki/Pictures/Rojo.png"));
        Action amarillo = new AccionC("amarillo", Color.YELLOW, new ImageIcon("C:/Users/inaki/Pictures/Amarillo.png"));
        Action salir = new AbstractAction("Salir", new ImageIcon("C:/Users/inaki/Pictures/salir.png")) {
            //clase interna anonima
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        };

        JMenu menu = new JMenu("Color");
        // Elementos de menú
        menu.add(new JMenuItem(azul));
        menu.add(new JMenuItem(rojo));
        menu.add(new JMenuItem(amarillo));
        // Barra
        JMenuBar barra = new JMenuBar();
        barra.add(menu);
        setJMenuBar(barra);
        //construccion de la barra 
        JToolBar barraErramientas = new JToolBar();
        barraErramientas.add(azul);
        barraErramientas.add(amarillo);
        barraErramientas.add(rojo);//agregamos bottones
        barraErramientas.addSeparator();
        barraErramientas.add(salir);
        add(barraErramientas, BorderLayout.SOUTH);
    }

    private class AccionC extends AbstractAction {

        public AccionC(String nombre, Color c, Icon icono) {
            putValue(Action.NAME, nombre);
            putValue(Action.SHORT_DESCRIPTION, "Cambiar color a " + nombre);
            putValue(Action.SMALL_ICON, icono);  // Corrección de `SHORT_DESCRIPTION` a `SMALL_ICON`
            putValue("Color", c);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("Color");
            lamina.setBackground(c);
        }
    }
}
