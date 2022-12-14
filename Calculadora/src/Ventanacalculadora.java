import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.*;
// en la parte de abajo estamos haciendo las me didas para hacer la ventana y la llamamos en el app
public class Ventanacalculadora extends JFrame {
    /**
     * 
     */
    public Ventanacalculadora() {
        super();
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int filas = 5;
        int columnas= 3;
        int sepH= 2;
        int sepV=2;
        setLayout(new GridLayout(filas,columnas,sepH,sepV));

        for(int i=1;i<10;i++){
            add(new JButton(Integer.toString(i)));

            JTextField texto = new JTextField("texto");
            
            

            
        }
    }

    public Container teclado(){
        // TODO: crear arreglo de Strings con los botones 
        String [] numeros = ("7","8","9","/","4","5","6","*","1","2","3","-","C","0","+");
        //TODO: crear un contenedor
        teclas = new JButton(16);
        Conteiner teclas =
        //TODO: establecerle el diseño GridLayout
        /*aqui */ setLayout(new GridLayout(filas,columnas,sepH,sepV));
        //TODO: llenarlo de botones
        /*aqui */
        
        //TODO: retornalo
        return null;
    }
}
    

