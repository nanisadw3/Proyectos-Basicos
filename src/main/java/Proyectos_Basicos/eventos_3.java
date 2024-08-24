package Proyectos_Basicos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class eventos_3 {
    
    public static void main(String[] args) {
        Marco_eventos3 m = new Marco_eventos3();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

class Marco_eventos3 extends JFrame {
    
    public Marco_eventos3() {
        setTitle("eventos de ventana");
        setSize(500, 350);
        addWindowListener(new M_ventana_2());
    }
}

class M_ventana_2 extends WindowAdapter {
    
    @Override
    public void windowIconified(WindowEvent e) {//para no tener todos los metodos solo uno de ellos 
        JOptionPane.showMessageDialog(null, "Ventana minimizada");
    }
    
}
