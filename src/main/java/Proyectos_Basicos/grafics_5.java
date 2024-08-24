package Proyectos_Basicos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;

public class grafics_5 {
    
    public static void main(String[] args) {
        Marco_S m = new Marco_S();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
//Marco
class Marco_S extends JFrame{
    public Marco_S(){
        
        setTitle("Divujos_4");
        setSize(600,600);
        Lamina_S l = new Lamina_S();
        add(l);
        l.setBackground(Color.darkGray);//cambias el color de la lamina
        //l.setBackground(SystemColor.window);//todas las interfases se asemejan al sistema operativo 
        
    }
}

//Lamina
class Lamina_S extends JPanel {

    //divujos
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        File file = new File("C:/Users/inaki/OneDrive/Documentos/NetBeansProjects/interfacesG/src/umbreon.png");//ruta de la imagen 
        
        try {
            
            im = ImageIO.read(file);//le asignamos a la variable im la ruta de la imagen 
            
        } catch (IOException e) {
            
            System.out.println("La imagen no se encontro");//en caso de error
        }
        
        int anchura = im.getWidth(this);
        int altura = im.getHeight(this);
        
        
        g.drawImage(im, 0, 0, null);
        
        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                g.copyArea(0, 0, anchura, altura, anchura*i, altura*j);
            }
        }*/
        
    }
    
    
    Image im ;//variable imagen
    
}