package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;

public class jslider_2 {
    public static void main(String[] args) {
        Marco_JSD m = new Marco_JSD();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setLocationRelativeTo(null);
    }
}
class Marco_JSD extends JFrame{
    public Marco_JSD(){
        setSize(550,350);
        setTitle("Jslider 2");
        
        Lamina_JSD l = new Lamina_JSD();
        add(l);
    }
        
}
class Lamina_JSD extends JPanel{
    
    private JLabel etiqueta;
    private JSlider slider;
    private static int contador;
    
    public Lamina_JSD(){
        
        setLayout(new BorderLayout());
        etiqueta = new JLabel("En un lugar de la mancha...");
        slider = new JSlider(10,50,15);
        slider.setMajorTickSpacing(10);//etiquetas mayores de 25 en 25
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setFont(new Font("CascadiaCode",Font.PLAIN,10));
        
        JPanel lamina_2 = new JPanel();
        lamina_2.add(slider);
        
        Accion_slider accion = new Accion_slider();
        slider.addChangeListener(accion);//asi se pone a la escucha el slider
        
        add(etiqueta,BorderLayout.CENTER);
        add(lamina_2, BorderLayout.NORTH);
    }
    private class Accion_slider implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            contador = slider.getValue();
            //System.out.println("Manupulacion slider: "+ contador);
            etiqueta.setFont(new Font("CascadiaCode", Font.PLAIN,contador));
        }
        
    }
}
