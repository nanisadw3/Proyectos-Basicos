package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Practica_1 {
    public static void main(String[] args) {
        Marco_p_1 m = new Marco_p_1();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setVisible(true);
    }
}

class Marco_p_1 extends JFrame {
    public Marco_p_1() {
        setTitle("Procesador de textos");
        setSize(550, 400);

        Lamina_p_1 l = new Lamina_p_1();
        add(l);
    }
}

class Lamina_p_1 extends JPanel {
    JTextPane area = new JTextPane();
    String fuenteActual = "Arial";
    int tamanoActual = 12;
    int tipoDeLetraActual = Font.PLAIN;

    public Lamina_p_1() {
        setLayout(new BorderLayout());

        JMenuBar menu = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamano = new JMenu("Tamaño");

        menu.add(fuente);
        menu.add(estilo);
        menu.add(tamano);

        // Opciones de fuente
        JMenuItem cascadia = new JMenuItem("Cascadia Code");
        cascadia.addActionListener(new Eventos_Menu("Cascadia Code", true, false));
        JMenuItem courier = new JMenuItem("Courier");
        courier.addActionListener(new Eventos_Menu("Courier", true, false));
        JMenuItem verdana = new JMenuItem("Verdana");
        verdana.addActionListener(new Eventos_Menu("Verdana", true, false));

        fuente.add(cascadia);
        fuente.add(courier);
        fuente.add(verdana);

        // Opciones de estilo
        JMenuItem negrita = new JMenuItem("Negrita");
        negrita.addActionListener(new Eventos_Menu(Font.BOLD, false, true));
        JMenuItem cursiva = new JMenuItem("Cursiva");
        cursiva.addActionListener(new Eventos_Menu(Font.ITALIC, false, true));

        estilo.add(negrita);
        estilo.add(cursiva);

        // Opciones de tamaño
        JMenuItem doce = new JMenuItem("12");
        doce.addActionListener(new Eventos_Menu(12, false, false));
        JMenuItem catorce = new JMenuItem("14");
        catorce.addActionListener(new Eventos_Menu(14, false, false));
        JMenuItem dieciseis = new JMenuItem("16");
        dieciseis.addActionListener(new Eventos_Menu(16, false, false));
        JMenuItem veinte = new JMenuItem("20");
        veinte.addActionListener(new Eventos_Menu(20, false, false));
        JMenuItem veinticuatro = new JMenuItem("24");
        veinticuatro.addActionListener(new Eventos_Menu(24, false, false));

        tamano.add(doce);
        tamano.add(catorce);
        tamano.add(dieciseis);
        tamano.add(veinte);
        tamano.add(veinticuatro);

        add(area, BorderLayout.CENTER);
        add(menu, BorderLayout.NORTH);
    }

    private class Eventos_Menu implements ActionListener {
        String fuente;
        int tamano;
        int tipoDeLetra;
        boolean esFuente;
        boolean esEstilo;

        public Eventos_Menu(String fuente, boolean esFuente, boolean esEstilo) {
            this.fuente = fuente;
            this.esFuente = esFuente;
            this.esEstilo = esEstilo;
        }

        public Eventos_Menu(int tamanoOEstilo, boolean esFuente, boolean esEstilo) {
            if (esEstilo) {
                this.tipoDeLetra = tamanoOEstilo;
            } else {
                this.tamano = tamanoOEstilo;
            }
            this.esFuente = esFuente;
            this.esEstilo = esEstilo;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (esFuente) {
                fuenteActual = fuente; // Actualiza la fuente actual
            } else if (esEstilo) {
                tipoDeLetraActual = tipoDeLetra; // Actualiza el tipo de letra actual
            } else {
                tamanoActual = tamano; // Actualiza el tamano actual
            }
            area.setFont(new Font(fuenteActual, tipoDeLetraActual, tamanoActual)); // Aplica la nueva fuente, tipo y tamaño
        }
    }
}
