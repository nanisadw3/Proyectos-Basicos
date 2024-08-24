
package Proyectos_Basicos;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

public class emergente {
    public static void main(String[] args) {
        
        Marco_emergente m = new Marco_emergente();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        
    }
}

class Marco_emergente extends JFrame{
    public Marco_emergente(){
        
        setTitle("Emergente");
        setSize(300,250);
        
        Lamina_emergente l = new Lamina_emergente();
        add(l);
    }
}
class Lamina_emergente extends JPanel{
    public Lamina_emergente(){
        
        setLayout(new BorderLayout());
        JMenuBar menu = new JMenuBar();
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamano = new JMenu("Tamano");
        menu.add(fuente);
        menu.add(estilo);
        menu.add(tamano);
        add(menu, BorderLayout.NORTH);
        JTextPane area = new JTextPane();
        add(area,BorderLayout.CENTER);
        

        JPopupMenu emergente = new JPopupMenu();
        JMenuItem opcion1 = new JMenuItem("Opcion 1");
        emergente.add(opcion1);
        //para que el menu funcione
        //es la forma de agregarlo al menu 
        //para que tenga mas opciones tendrias que instanciar ams menu items 
                area.setComponentPopupMenu(emergente);

    }
}