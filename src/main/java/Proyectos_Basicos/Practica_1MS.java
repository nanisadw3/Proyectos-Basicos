package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_B;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.event.AncestorListener;
import javax.swing.text.StyledEditorKit;

public class Practica_1MS {

    public static void main(String[] args) {
        Marc_m m = new Marc_m();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Marc_m extends JFrame {

    public Marc_m() {
        setTitle("Procesador de texto");
        setSize(550, 480);
        Lami_m l = new Lami_m();
        add(l);
    }
}

class Lami_m extends JPanel {

    JTextPane area = new JTextPane();
    JMenu estilo, fuente, tamano;

    public Lami_m() {
        setLayout(new BorderLayout());
        JMenuBar menu = new JMenuBar();
        estilo = new JMenu("Estilo");
        fuente = new JMenu("Fuente");
        tamano = new JMenu("Tamano");

        menu.add(fuente);
        menu.add(estilo);
        menu.add(tamano);
        llenar_Menu("Cascadia Code", "fuente", 0, 0, "");
        llenar_Menu("Arial", "fuente", 0, 0, "");
        llenar_Menu("Verdana", "fuente", 0, 0, "");
        //con chek
        //JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("C:/Users/inaki/Downloads/letra-b.png"));
        //JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("C:/Users/inaki/Downloads/fuente-cursiva.png"));

        JMenuItem negrita = new JMenuItem("Negrita", new ImageIcon("C:/Users/inaki/Pictures/Bold.png"));
        JMenuItem cursiva = new JMenuItem("Cursiva", new ImageIcon("C:/Users/inaki/Pictures/Italic.png"));

        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        //atajos de teclado
        negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        estilo.add(negrita);
        estilo.add(cursiva);

        //llenar_Menu("Negrita", "estilo", 0, Font.BOLD,"C:/Users/inaki/Downloads/letra-b.png");
        //llenar_Menu("Cursiva", "estilo", 0, Font.ITALIC,"C:/Users/inaki/Downloads/fuente-cursiva.png");
        // llenar_Menu("15", "tamano", 15, 0,"");
        // llenar_Menu("20", "tamano", 20, 0,"");
        // llenar_Menu("25", "tamano", 25, 0,"");
        // lenar_Menu("30", "tamano", 30, 0,"");
        //radiobutton para los tamanos
        ButtonGroup grupoTam = new ButtonGroup();
        JRadioButtonMenuItem quinse = new JRadioButtonMenuItem("15");
        JRadioButtonMenuItem beinte = new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem beintisinco = new JRadioButtonMenuItem("25");
        JRadioButtonMenuItem treinta = new JRadioButtonMenuItem("30");

        grupoTam.add(quinse);
        grupoTam.add(beinte);
        grupoTam.add(beintisinco);
        grupoTam.add(treinta);

        quinse.addActionListener(new StyledEditorKit.FontSizeAction("Tamano", 15));
        beinte.addActionListener(new StyledEditorKit.FontSizeAction("Tamano", 20));
        beintisinco.addActionListener(new StyledEditorKit.FontSizeAction("Tamano", 25));
        treinta.addActionListener(new StyledEditorKit.FontSizeAction("Tamano", 30));

        //para poner un atajo de teclado 
        treinta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
        tamano.add(quinse);
        tamano.add(beinte);
        tamano.add(beintisinco);
        tamano.add(treinta);

        area.setFont(new Font("Arial", Font.PLAIN, 15));

        add(menu, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        //menu emergente
        JPopupMenu emergente = new JPopupMenu();
        JMenuItem negrita_e = new JMenuItem("Negtita");
        JMenuItem cursiva_e = new JMenuItem("Cursiva");
        negrita_e.addActionListener(new StyledEditorKit.BoldAction());
        cursiva_e.addActionListener(new StyledEditorKit.ItalicAction());

        emergente.add(negrita_e);
        emergente.add(cursiva_e);

        area.setComponentPopupMenu(emergente);

        //barra de erramientas 
        barraErramientas = new JToolBar();
        barraErramientas.setOrientation(1);
        //agregar yponer a la escucha 
        configuraBarra("C:/Users/inaki/Pictures/Bold.png").addActionListener(new StyledEditorKit.BoldAction());
        configuraBarra("C:/Users/inaki/Pictures/Italic.png").addActionListener(new StyledEditorKit.ItalicAction());
        configuraBarra("C:/Users/inaki/Pictures/under.png").addActionListener(new StyledEditorKit.UnderlineAction());
        barraErramientas.addSeparator();
        configuraBarra("C:/Users/inaki/Pictures/Rojo.png").addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.red));
        configuraBarra("C:/Users/inaki/Pictures/Azul.png").addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.blue));
        configuraBarra("C:/Users/inaki/Pictures/Amarillo.png").addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.yellow));
        barraErramientas.addSeparator();
        configuraBarra("C:/Users/inaki/Pictures/Derecha.png").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
        configuraBarra("C:/Users/inaki/Pictures/Hizquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("Hizquierda", 0));
        configuraBarra("C:/Users/inaki/Pictures/Justificado.png").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
        configuraBarra("C:/Users/inaki/Pictures/Centro.png").addActionListener(new StyledEditorKit.AlignmentAction("Centro", 1));

        add(barraErramientas, BorderLayout.EAST);
    }

    public JButton configuraBarra(String ruta) {

        JButton boton = new JButton(new ImageIcon(ruta));
        barraErramientas.add(boton);
        return boton;
    }
    JButton negrita, italiv, subrallado, azul, rojo, amarillo, hizquiera, centro, derecha, justificado;
    JToolBar barraErramientas;

    public void llenar_Menu(String titulo, String padre, int tam, int stilo, String ruta) {

        JMenuItem nuevo = new JMenuItem(titulo, new ImageIcon(ruta));
        if (padre == "fuente") {
            if (padre.equals("fuente")) {
                //cambia el estilo con una sola linea
                nuevo.addActionListener(new StyledEditorKit.FontFamilyAction(titulo, titulo));
                fuente.add(nuevo);
            }
        } else if (padre == "estilo") {

            estilo.add(nuevo);

            if (stilo == Font.BOLD) {
                //cambia estuilo en una sola linea
                nuevo.addActionListener(new StyledEditorKit.BoldAction());

            } else if (stilo == Font.ITALIC) {
                nuevo.addActionListener(new StyledEditorKit.ItalicAction());
            }

        } else if (padre == "tamano") {

            tamano.add(nuevo);
            //solo con esta linea puedes cambiar el tamano del texto seleccionao
            nuevo.addActionListener(new StyledEditorKit.FontSizeAction("Tamano", tam));
        }

    }
}
