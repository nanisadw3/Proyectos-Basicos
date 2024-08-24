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

public class Practica_1_M {

    public static void main(String[] args) {
        Marco_p_1M m = new Marco_p_1M();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setVisible(true);
    }
}

class Marco_p_1M extends JFrame {

    public Marco_p_1M() {
        setTitle("Procesador de textos");
        setSize(550, 400);

        Lamina_p_1M l = new Lamina_p_1M();
        add(l);
    }
}

class Lamina_p_1M extends JPanel {

    public Lamina_p_1M() {
        setLayout(new BorderLayout());

        JMenuBar menu = new JMenuBar();
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamano = new JMenu("Tamano");

        menu.add(fuente);
        menu.add(estilo);
        menu.add(tamano);

        //fuente
        llena_menu("Cascadia Code", "fuente", "", 1, 12);
        llena_menu("Courier", "fuente", "", 1, 12);
        llena_menu("Verdana", "fuente", "", 1, 12);
        //estilos
        llena_menu("Cursiva", "estilo", "", Font.ITALIC, 1);
        llena_menu("Negrita", "estilo", "", Font.BOLD, 1);
        //tamano
        llena_menu("12", "tamano", "", 9, 12);
        llena_menu("14", "tamano", "", 9, 14);
        llena_menu("16", "tamano", "", 9, 16);
        llena_menu("20", "tamano", "", 9, 20);
        llena_menu("24", "tamano", "", 9, 24);

        add(area, BorderLayout.CENTER);
        add(menu, BorderLayout.NORTH);
    }
    JTextPane area = new JTextPane();
    JMenu fuente, estilo, tamano;
    Font letras;

    public void llena_menu(String titulo, String menu, String tipo, int tletra, int tam) {

        JMenuItem elemMenu = new JMenuItem(titulo);

        if (menu == "fuente") {

            fuente.add(elemMenu);

        } else if (menu == "estilo") {

            estilo.add(elemMenu);

        } else {

            tamano.add(elemMenu);

        }
        elemMenu.addActionListener(new GestionDeEventos(menu, titulo, tletra, tam));

    }

    private class GestionDeEventos implements ActionListener {

        private String fuente, titulo;
        private int estilo, tamano;
        Font FuenteActual;

        public GestionDeEventos(String titulo, String tetxto, int estilo, int tamano) {//constructor

            this.fuente = tetxto;
            this.titulo = titulo;
            this.estilo = estilo;
            this.tamano = tamano;

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            FuenteActual = area.getFont();

            if (titulo == "fuente") {

                estilo = FuenteActual.getStyle();
                tamano = FuenteActual.getSize();

            } else if (titulo == "estilo") {

                fuente = FuenteActual.getFontName();
                tamano = FuenteActual.getSize();
                
            } else if (titulo == "tamano"){
                estilo = FuenteActual.getStyle();
                fuente = FuenteActual.getFontName();

            }

            area.setFont(new Font(fuente, estilo, tamano));
            System.out.println("fuente ="+ fuente +" Estilo " + estilo + " Tamano " + tamano);
        }

    }
}
