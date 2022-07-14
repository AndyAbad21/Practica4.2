/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import java.util.Locale;
import java.util.ResourceBundle;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Andy Abad
 */
public class Practica0303 {

    public static void main(String[] args) {
        //ResourceBundle resourceBundle=ResourceBundle.getBundle("mensajes.mensajes",new Locale("es","EC"));
        VentanaPrincipalAsignatura vpa=new VentanaPrincipalAsignatura();
        vpa.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vpa.setVisible(true);
    }
}
