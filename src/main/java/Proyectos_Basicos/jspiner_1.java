package Proyectos_Basicos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class jspiner_1 {

    public static void main(String[] args) {

        Marco_spiner_1 m = new Marco_spiner_1();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setVisible(true);

    }
}

class Marco_spiner_1 extends JFrame {

    public Marco_spiner_1() {
        setTitle("Spinner");
        setSize(550, 350);
        Lamina_spiner_1 l = new Lamina_spiner_1();
        add(l);
    }
}

class Lamina_spiner_1 extends JPanel {

    public Lamina_spiner_1() {
        //JSpinner spiner = new JSpinner(new SpinnerDateModel());spinner de fecha y hora

        String liasta[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();//obtenemos todas las fuentes de la pc
        JSpinner spinner = new JSpinner(new SpinnerListModel(liasta));//spinner con elementos de un array
        JSpinner spinner_2 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));//pueses cambiar el stepa para que no valla de uno en uno o del 0 al 10
        JSpinner spinner_3 = new JSpinner(new Modelo_Spinner());
        Dimension d = new Dimension(200, 20);
        spinner.setPreferredSize(d);//cambias dimenciones de spinner
        add(spinner);
        add(spinner_2);
        add(spinner_3);
    }

    private class Modelo_Spinner extends SpinnerNumberModel {

        public Modelo_Spinner() {
         
            super(5,0,10,1);//llama al constructor de la clase padre "SpinnerNumberModel"
            //y le estamos pasando estos valores parra que haga lo que vimos arriba 
            
        }//metodos eredados
        @Override
        public Object getNextValue(){
            
            return super.getPreviousValue();//nos devuelbe el valor prvio en lugarr del valor siguiente 
        }
        @Override
        public Object getPreviousValue(){
            
            return super.getNextValue();//en lugar de devolvernos el anterior, nos devuelve el siguoente 
        }
    }
}
