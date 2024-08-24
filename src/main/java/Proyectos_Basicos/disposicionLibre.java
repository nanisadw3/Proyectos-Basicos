
package Proyectos_Basicos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class disposicionLibre {
    public static void main(String[] args) {
         Marco_libre m = new Marco_libre();
         m.setVisible(true);
         m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         m.setLocationRelativeTo(null);
         
    }
}
class Marco_libre extends JFrame{
    public Marco_libre(){
        setSize(300,400);
        setTitle("Disposiciones Libres");
        Lamina_Libre l = new Lamina_Libre();
        add(l);
    }
}
class Lamina_Libre extends JPanel{
    public Lamina_Libre(){
        
        setLayout(new Disposicion());//layout libre
        JLabel etiqueta = new JLabel("Nombre");
        JLabel etiqueta_2 = new JLabel("Apellido");
        JTextField txt_Nombre = new JTextField();
        JTextField txt_Apellido = new JTextField();
        JLabel etiqueta_3 = new JLabel("Edad");
        JTextField txt_edad = new JTextField();
        JLabel etiqueta_4 = new JLabel("Telefono");
        JTextField txt_telefono = new JTextField();
        //etiqueta.setBounds(20, 20, 80, 10);
        //txt_Nombre.setBounds(100, 20, 100, 20);
        //etiqueta_2.setBounds(20, 47, 80, 10);
        //txt_Apellido.setBounds(100, 45, 100, 20);

        add(etiqueta);
        add(txt_Nombre);
        add(etiqueta_2);
        add(txt_Apellido);
        add(etiqueta_3);
        add(txt_edad);
        add(etiqueta_4);
        add(txt_telefono);
        
        
    }
}
class Disposicion implements LayoutManager{

    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component comp) {
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container contenedor) {
    
        int d = contenedor.getWidth();//se almacenan las dimenciones del contnedor
        x = d/2;//punto central original
        
        
        int contador=0;//saber cuantos elementos he agregado
        int n =  contenedor.getComponentCount();//elementos en el conetendor
        for (int i = 0; i < n; i++) {
            contador ++;
            
            Component p = contenedor.getComponent(i);
            //se almacena el primer componente
            p.setBounds(x -100,y,100,20);
            x +=100;
            if(contador %2 == 0){//para separar por parejas
                x = d/2;
                y +=45;
            }
        }
    }
    
    private int x;
    private int y = 20;
}
