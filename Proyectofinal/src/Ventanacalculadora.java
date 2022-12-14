import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanacalculadora extends JFrame implements ActionListener {
    Container teclado;
    JButton[] botones = new JButton[16];
    JTextField display;
    JButton resultado;
    String pantalla;
    Calculadora c = new Calculadora();
    public Ventanacalculadora(){
        super("calculadora");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton teclado = new JButton("teclado");
        display = new JTextField(100);
        resultado = new JButton("resultado");
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx =0;
        gbc.gridy =0;
        gbc.gridwidth =1;
        gbc.gridheight =1;
        gbc.weighty =0.15;
        gbc.weightx =0.15;
        gbc.fill =GridBagConstraints.BOTH;
        add(display,gbc);
        gbc.gridy =1;
        add(resultado,gbc);
        gbc.gridy=2;
        gbc.weighty =0.7;
        gbc.weightx =0.7;
        add(crearBotones(),gbc);
        teclado.addActionListener(this);
        resultado.addActionListener(this);
        pantalla= "";
    }
    private Container crearBotones(){
        Container t = new Container();
        t.setLayout(new GridLayout(4,4));
        String[] botones_N ={"7","8","9","/","4","5","6","*","1","2","3","-","C","0","+","."};
        for(int i=0;i<botones_N.length;i++){
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
            display.setText(Double.toString(c.resultadodisplay(pantalla)));

        }
        for (int i=0;i<botones.length;i++){
            if(i==3){
                pantalla ="0";
                display.setText(pantalla);

            }
            else if(e.getSource() == botones[i]){
                System.out.println(botones[i].getText());
                pantalla+=botones[i].getText();
                display.setText(pantalla);
            }
        }
        if(e.getSource()== botones[12]){
            pantalla="";
            display.setText(pantalla);
            c.reiniciar();
        }
    }
    
}
