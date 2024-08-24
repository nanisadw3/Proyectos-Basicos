package Proyectos_Basicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mo {

    public static void main(String[] args) {

        Marco_mo m = new Marco_mo();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}

class Marco_mo extends JFrame {

    public Marco_mo() {
        setSize(300, 200);
        setTitle("Multiples Eventos");
        Lamina_mo l = new Lamina_mo();
        add(l);
    }
}

class Lamina_mo extends JPanel {

    public Lamina_mo() {

        JButton nuevo = new JButton("Nuevo");
        evento_nuevo n = new evento_nuevo();//instancia del evento
        nuevo.addActionListener(n);
        
        add(nuevo);
        add(cerrar);
    }
    
    private class evento_nuevo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        nuevo_M m = new nuevo_M(cerrar);
        m.setVisible(true);
        }
        
        
    }
    
    JButton cerrar = new JButton("Cerrar todo"); //se envia por parametros el boton
}
class nuevo_M extends JFrame{//clase que construlle ventanas
    public nuevo_M(JButton principal){
        contador++;//incrementamos contador 
        
        setTitle("ventana " +contador);
        setBounds(40*contador, 40*contador, 300,150);
        
        cerrar cerrar_T = new cerrar();
        principal.addActionListener(cerrar_T);
    }
    
    private class cerrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }

           
        }
    private static int contador = 0;
}
        

