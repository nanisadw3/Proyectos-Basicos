package Proyectos_Basicos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class eventos_4 {
     public static void main(String[] args) {
        Marco_eventos4 m = new Marco_eventos4();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
    }
}
class Marco_eventos4 extends JFrame{
    public Marco_eventos4(){
        setTitle("Estados de ventana");
        setSize(500,350);
        Estado cambia = new Estado();
        addWindowStateListener(cambia);
    }
}
class Estado implements WindowStateListener{

    @Override
    public void windowStateChanged(WindowEvent e) {
        JOptionPane.showMessageDialog(null, "La ventana cambio de estado" + e.getNewState());
    }

    
    
}