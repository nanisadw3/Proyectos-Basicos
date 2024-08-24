
package Proyectos_Basicos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class jslider_1 {
    public static void main(String[] args) {
        Marco_JS m = new Marco_JS();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
class Marco_JS extends JFrame{
    public Marco_JS(){
        setTitle("JSlider");
        setSize(550,350);
        Lamina_JS l = new Lamina_JS();
        add(l);
    }
}
class Lamina_JS extends JPanel{
    public Lamina_JS(){
        
        JSlider slider = new JSlider();
        //slider.setOrientation(1); se pondria vertical o 0 horizontal
        slider.setMajorTickSpacing(25);//las marcas mayores de 25 en 25
        slider.setMinorTickSpacing(5);//las chicas de 5 en 5
        slider.setPaintLabels(true);//se muestran los numeros, y se pueden podficar con la clase font
        slider.setSnapToTicks(true);//se inmanta a la cantidad seleccionada
        slider.setPaintTicks(true);
        add(slider);
        
    }
}