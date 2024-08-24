package Proyectos_Basicos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class calc {

    public static void main(String[] args) {

        Marco_calc m = new Marco_calc();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}

class Marco_calc extends JFrame {

    public Marco_calc() {
        setTitle("Marco Calc");
        Lamina_calc l = new Lamina_calc();
        add(l);
        pack();//tamano adaptado por el interior

    }
}

class Lamina_calc extends JPanel {

    private JPanel Lamina_dos_c = new JPanel();
    private JButton display = new JButton("0");
    private boolean primera;
    private double resultado;
    private String ultima_op ="=";

    public Lamina_calc() {
        primera = true;
        setLayout(new BorderLayout());//disposicion definida en la lamina

        display.setEnabled(false);//boton desabilitado

        add(display, BorderLayout.NORTH);

        JPanel lamina_dos_c = new JPanel();
        Lamina_dos_c.setLayout(new GridLayout(4, 4));

        ActionListener accion = new insertaNumero();
        ActionListener orden = new AccionOrden();

        for (int i = 0; i <= 9; i++) {
            String str_i = Integer.toString(i);
            crear_B(str_i, accion);
        }

        crear_B("+", orden);
        crear_B("-", orden);
        crear_B("*", orden);
        crear_B(".", accion);
        crear_B("/", orden);
        crear_B("=", orden);

        add(Lamina_dos_c);

    }

    private void crear_B(String nombre, ActionListener accion) {

        JButton btn = new JButton(nombre);
        btn.addActionListener(accion);//ponemos a la escucha al boton
        Lamina_dos_c.add(btn);
    }

    private class insertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String numero = e.getActionCommand();//devuelve el string asociado a la accion
            if (primera) {
                display.setText("");
                primera = false;
            }
            display.setText(display.getText() + numero);
        }

    }

    private class AccionOrden implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            calcular(Double.parseDouble(display.getText()));
            String operacion = e.getActionCommand();
            primera = true;//para que el siguiente elemento sea nuevo 
            ultima_op = operacion;
        }

        public void calcular(double x) {

            if (ultima_op.equals("+")) {
                resultado += x;
            }else if (ultima_op.equals("-")){
                resultado -=x;
            }else if (ultima_op.equals("*")){
                resultado *=x;
            }else if (ultima_op.equals("/")){
                resultado /=x;
            }
            else if (ultima_op.equals("=")){
                resultado =x;
            }
            
            display.setText(""+resultado);
        }

    }
}
