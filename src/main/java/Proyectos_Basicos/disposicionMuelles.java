
package Proyectos_Basicos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class disposicionMuelles {
    public static void main(String[] args) {
        MarcoMuelle m = new MarcoMuelle();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
class MarcoMuelle extends JFrame{
    public MarcoMuelle(){
        setTitle("Disposicion en muelle");
        setSize(1000, 350);
        setVisible(true);
        LaminaMuelle l = new LaminaMuelle();
        add(l);
    }
}
class LaminaMuelle extends JPanel{
    JButton btn_1,btn_2,btn_3;
    public LaminaMuelle(){
        btn_1 = new JButton("Botton 1");
        btn_2 = new JButton("Botton 2");
        btn_3 = new JButton("Botton 3");
        
        SpringLayout layout = new SpringLayout();//instancia de la disposicion spring
        
        setLayout(layout);
        
        add(btn_1);
        add(btn_2); 
        add(btn_3);
        
        Spring muelle = Spring.constant(0,10,100);//construccion del muelle
        Spring muelleR = Spring.constant(10);//muelle que no cambia 
        layout.putConstraint(SpringLayout.WEST, btn_1, muelle, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.WEST, btn_2, muelleR, SpringLayout.EAST, btn_1);
        layout.putConstraint(SpringLayout.WEST, btn_3, muelle, SpringLayout.EAST, btn_2);
        //hasta aqui ya estan los muelles entre los conenedores
        //este es el que centra los contenedires 
        layout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, btn_3);
    }
}