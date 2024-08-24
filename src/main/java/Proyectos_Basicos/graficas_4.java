package Proyectos_Basicos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class graficas_4 {
    public static void main(String[] args) {
        
        Marco_C m = new Marco_C();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        
    }
}
//Marco
class Marco_C extends JFrame{
    public Marco_C(){
        
        setTitle("Divujos_4");
        setSize(400,400);
        Lamina_C l = new Lamina_C();
        add(l);
        l.setBackground(Color.darkGray);//cambias el color de la lamina
        //l.setBackground(SystemColor.window);//todas las interfases se asemejan al sistema operativo 
        
    }
}

//Lamina
class Lamina_C extends JPanel {

    //divujos
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        //dibujo de rectangulo 
        Graphics2D g2 = (Graphics2D) g;//refundicion 
        
        Font fuente = new Font("Arial", Font.BOLD, 26);//creamos la fuente 
        
        g2.setFont(fuente);//asignamos la fuente 
        g2.setColor(Color.white);//le damos color al texxto
        g2.drawString("Inaki", 100, 100);
        
        Font fuente_D =new Font("Cascadia Code", Font.ITALIC, 18);
        g2.setFont(fuente_D);
        g2.setColor(Color.gray);
        g2.drawString("Java", 100, 150);
        
    }
}