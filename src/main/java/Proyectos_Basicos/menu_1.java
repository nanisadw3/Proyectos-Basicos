package Proyectos_Basicos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class menu_1 {
    
    public static void main(String[] args) {
        Marco_MN m = new Marco_MN();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setVisible(true);
    }
    
}
class Marco_MN extends JFrame{
    public Marco_MN(){
        
        setTitle("Menu");
        setSize(550,400);
        Lamina_MN l = new Lamina_MN();
        add(l);
    }
}
class Lamina_MN extends JPanel{
    
    public Lamina_MN(){
        //menu
        JMenuBar menu = new JMenuBar();
        //items del menu
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Hrramientas");
        JMenu archivo = new JMenu("Archivo");
        //sub menus
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarC = new JMenuItem("Guardar Como");
        
        archivo.add(guardar);
        archivo.add(guardarC);
        
        JMenuItem cortar = new JMenuItem("Copiar");
        JMenuItem copiar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");

        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        
        //sub menu
        edicion.addSeparator();
        JMenu opciones = new JMenu("Opciones");
        JMenuItem opcion_1 = new JMenuItem("Opcion 1");
        JMenuItem opcion_2 = new JMenuItem("Opcion 2");
        
        edicion.add(opciones);
        opciones.add(opcion_1);
        opciones.add(opcion_2);
        
        JMenuItem general = new JMenuItem("General");
        herramientas.add(general);
        
        menu.add(archivo);
        menu.add(herramientas);
        menu.add(edicion);
        add(menu);
        
    }
}
