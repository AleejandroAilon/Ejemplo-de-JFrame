import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConBoton {
    public static void main(String[] agrs){
        // Crear el método
        JFrame ventana = new JFrame("Ventana con boton");

        // Establecer el tamaño de la ventana
        ventana.setSize(500, 400);

        // Establcer la operación de cierre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un botón y añadirlo a la ventana
        JButton boton = new JButton("Haz click aqui");
        ventana.getContentPane().add(boton);

        // Añadir un ActionListener al boton
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(ventana, "El boton se ha presionado");
            }
        });

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
