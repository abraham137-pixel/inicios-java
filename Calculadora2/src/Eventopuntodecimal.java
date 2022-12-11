public class Eventopuntodecimal {
    private void eventoDecimal(){

        botones[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Si todavía no he añadido el punto decimal al número actual
                if (!puntoDecimal){
                    display.setText(display.getText() + textoBotones[15]);
                    puntoDecimal = true; //Ya no puedo añadir el punto decimal en este número
                    nuevoNumero = false; //Por si empiezo el número con punto decimal (por ejemplo, .537)
                }
            }
        });
    
    }
}
