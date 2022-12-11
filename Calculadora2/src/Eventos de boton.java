import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* MODIFICAR */

private void eventosNumeros() {

    for (int i = 0; i < 10; i++){
        int numBoton = numerosBotones[i];
        botones[numBoton].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Si es un nuevo número y no es 0, sustituyo el valor del display
                if (nuevoNumero){
                    if (!textoBotones[numBoton].equals("0")){
                        display.setText(textoBotones[numBoton]);
                        nuevoNumero = false; //Ya no es un nuevo número
                    }
                }
                //Si no, lo añado a los dígitos que ya hubiera
                else{
                    display.setText(display.getText() + textoBotones[numBoton]);
                }
            }
        });
    }
}