package Proyectos_Basicos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class eventos_2 {
    public static void main(String[] args) {
        Marco_ventana m = new  Marco_ventana();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Marco_ventana_d m2 = new Marco_ventana_d();
        m2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
}
class Marco_ventana_d extends JFrame{
    public Marco_ventana_d(){
        setTitle("eventos de ventana 2");
        setSize(500,350);
        M_ventana accion = new M_ventana();
        addWindowListener(accion);
    }
}
class Marco_ventana extends JFrame{
    public Marco_ventana(){
        setTitle("eventos de ventana");
        setSize(500,350);
        M_ventana accion = new M_ventana();
        addWindowListener(accion);
    }
}
class M_ventana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
       JOptionPane.showMessageDialog(null, "1");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "2");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "3");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "4");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "5");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "6");
    }
    
}