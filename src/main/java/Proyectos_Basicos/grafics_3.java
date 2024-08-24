package Proyectos_Basicos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class grafics_3 {

    public static void main(String[] args) {
        Marco_T m = new Marco_T();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
//Marco

class Marco_T extends JFrame {

    public Marco_T() {

        setTitle("Divujos_3");
        setSize(400, 400);
        Lamina_T l = new Lamina_T();
        add(l);
        l.setBackground(Color.darkGray);//cambias el color de la lamina
        //l.setBackground(SystemColor.window);//todas las interfases se asemejan al sistema operativo 

    }
}

//Lamina
class Lamina_T extends JPanel {

    //divujos
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        //dibujo de rectangulo 
        Graphics2D g2 = (Graphics2D) g;//refundicion 
        //los argumentos son double 
        Rectangle2D rectangulo = new Rectangle.Double(100, 100, 200, 150);

        //establecer color 
        g2.setPaint(Color.BLUE);

        g2.fill(rectangulo);//sustituimos draw por fill

        g2.setPaint(Color.red);//cambias el color de nuevo despues de javer divujado el anterior

        //este constructor no recive parametros
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);//elipse dentro del rectangulo
        g2.fill(elipse);//cambias draw por fill

    }
}
