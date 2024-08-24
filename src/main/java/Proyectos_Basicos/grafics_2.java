package Proyectos_Basicos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class grafics_2 {
    
    public static void main(String[] args) {
        Marco_D m = new Marco_D();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
//Marco
class Marco_D extends JFrame{
    public Marco_D(){
        
        setTitle("Divujos_2");
        setSize(400,400);
        Lamina_D l = new Lamina_D();
        add(l);
        
    }
}

//Lamina
class Lamina_D extends JPanel {

    //divujos
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        //dibujo de rectangulo 
        Graphics2D g2 = (Graphics2D) g;//refundicion 
        //los argumentos son double 
        Rectangle2D rectangulo = new Rectangle.Double(100,100,200,150);
        
        g2.draw(rectangulo);
        //este constructor no recive parametros
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);//elipse dentro del rectangulo
        g2.draw(elipse);
        
        g2.draw(new Line2D.Double(100,100,300,250));//dibujamos una linea dentro del draw
        
        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 150;
        
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX+radio,centroY+radio);
        
        g2.draw(circulo);
    }
}