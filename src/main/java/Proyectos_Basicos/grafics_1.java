
package Proyectos_Basicos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class grafics_1 {
    public static void main(String[] args) {
        
        Marco_U m = new Marco_U();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
}
//Marco
class Marco_U extends JFrame{
    public Marco_U(){
        
        setTitle("Divujos_1");
        setSize(400,400);
        Lamina_U l = new Lamina_U();
        add(l);
        
    }
}

//Lamina
class Lamina_U extends JPanel {

    //divujos
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(50, 50, 200, 200);
        g.drawLine(1, 1, 100, 100);
        g.drawArc(10, 20, 100, 100, 100, 150);
    }
}
