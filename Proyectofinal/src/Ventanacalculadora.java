import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanacalculadora extends JFrame implements ActionListener {
    Container teclado;
    JButton[] botones = new JButton[16];
    JTextField display;
    JButton resultado;
    String pantalla;
    public Ventanacalculadora(){
        super("calculadora");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton teclado = new JButton("teclado");
        display = new JTextField(100);
        resultado = new JButton("resultado");
        setLayout(new GridBagLayout());

        GridBagConstrains gbc = new  GridBagConstrains();
        gbc.gridx =0;
        gbc.gridy =0;
        gbc.gridwidth =1;
        gbc.gridheight =1;
        gbc.weigthy =0.15;
        gbc.fill =GridBagConstrains.BOTH;
        add(display,gbc);
        gbc.gridheight =1;
        add(resultado,gbc);
        gbc.gridheight =1;
        gbc.weigthy =0.7;
        gbc.weigthx =0.7;
        add(teclado,gbc);
        teclado.addActionListener(this);
        resultado.addActionListener(this);
        pantalla= "";
    }
    private Container crearBotones(){
        Container t = new Container();
        t.setLayout(new GridLayout(4,4))
        String[] botones_N =("7","8","9","/","4","5","6","*","1","2","3","-","C","0","+");
        for(int i=0;i<botones_N.lehgth,i++){
            JButton aux = new JButton(botones_N[i]);
            aux.addActionListener(this);
            botones[i] = aux;
            t.add(botones[i]);
        }
        return t;
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == resultado) {
            System.out.println("teclado");
            display.setText(pantalla);

        }
        if (e.getSource() == resultado) {
            System.out.println("resultado");
            display.setText(pantalla);

        }
        for (int i=0;<botones.lehgth;i++){
            if(i==3){
                pantalla ="0";
                display.setText(pantalla);

            }
            else if(e.getSource() == botones[i]){
                System.out.println(botones[i].getTex());
                pantalla+=botones[i].getTex();
                display.setText(pantalla);
            }
        }
    }
    
}
