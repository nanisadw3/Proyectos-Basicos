package Proyectos_Basicos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class eventos_5 {
    public static void main(String[] args) {
        Marco_eventos5 m = new Marco_eventos5();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
class Marco_eventos5 extends JFrame{

    public Marco_eventos5(){
        setSize(600,450);
        //raton evento = new raton();//asiganamos los eventos al marco 
        
        //addMouseListener(evento);
        
        adaptapter a = new adaptapter();
        addMouseListener(a);
    }
    
}

/*class raton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        //JOptionPane.showMessageDialog(null, "Click");
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //JOptionPane.showMessageDialog(null, "precionando");
        System.out.println("precionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //JOptionPane.showMessageDialog(null, "lebantado");
        System.out.println("Lebantado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}*/
class adaptapter extends MouseAdapter{
    
    /*@Override
    public void mouseClicked(MouseEvent e) {
        //JOptionPane.showMessageDialog(null, "Click");
        System.out.println("x= " + e.getX() + " y= "+ e.getY());
        System.out.println(e.getClickCount());
    }*/
    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getModifiersEx() == 1024){
            System.out.println("Hisquierda");
        }else if(e.getModifiersEx() == 4096){
            System.out.println("Derecho");
        }else{
            System.out.println("otro boton");
        }
    }
    
}