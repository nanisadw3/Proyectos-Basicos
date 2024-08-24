
package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Practica_1F {
    public static void main(String[] args) {
        Marco_p_1 m = new Marco_p_1();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setVisible(true);
    }
}
class Marco_p_1 extends JFrame{
    public Marco_p_1(){
        setTitle("Procesador de textos");
        setSize(550,400);
        
        Lamina_p_1 l = new Lamina_p_1();
        add(l);
    }
}
class Lamina_p_1 extends JPanel{
    JTextPane area = new JTextPane();
    public Lamina_p_1(){

        setLayout(new BorderLayout());
        //menu
        JMenuBar menu = new JMenuBar();
        JPanel lamina_Menu = new JPanel();
        //Items
        JMenu fuente = new JMenu("Fuete");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamano = new JMenu("Tamano");
        
        menu.add(fuente);
        menu.add(estilo);
        menu.add(tamano);
        //items 2 Fuente
        JMenuItem cascadia = new JMenuItem("Cascadia Code");
        cascadia.addActionListener(new Eventos_Menu("Cascadia Code"));
        JMenuItem courier = new JMenuItem("Courier");
        courier.addActionListener(new Eventos_Menu("Courier"));
        JMenuItem verdana = new JMenuItem("Verdana");
        verdana.addActionListener(new Eventos_Menu("Verdana"));
        
        
        fuente.add(cascadia);
        fuente.add(courier);
        fuente.add(verdana);
        
        //items 2 de estilos
        
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        
        estilo.add(negrita);
        estilo.add(cursiva);
        
        //items 2 de tamano
        
        JMenuItem doce = new JMenuItem("12");
        doce.addActionListener(new Eventos_Menu(12));
        JMenuItem cat = new JMenuItem("14");
        cat.addActionListener(new Eventos_Menu(14));
        JMenuItem diesiseis = new JMenuItem("16");
        diesiseis.addActionListener(new Eventos_Menu(16));
        JMenuItem beinte = new JMenuItem("20");
        beinte.addActionListener(new Eventos_Menu(20));
        JMenuItem beinticuatro = new JMenuItem("24");
        beinticuatro.addActionListener(new Eventos_Menu(24));

        tamano.add(doce);
        tamano.add(cat);
        tamano.add(diesiseis);
        tamano.add(beinte);
        tamano.add(beinticuatro);
        
       
        lamina_Menu.add(menu);
        add(area,BorderLayout.CENTER);
        add(lamina_Menu, BorderLayout.NORTH);
        
    }
    
    private class Eventos_Menu implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        
            
            area.setFont(new Font(Fuente,Font.PLAIN,tamano));
            
        }
        //variables del area de texto
        Font font = area.getFont();
        String Fuente;
        int tamano;
        //

        public Eventos_Menu(String Fuente){
            this.Fuente = Fuente;
            tamano = font.getSize();
        }
        public Eventos_Menu(int tamano){
            this.tamano = tamano;
            Fuente = font.getFontName();
        }
        
    }
}