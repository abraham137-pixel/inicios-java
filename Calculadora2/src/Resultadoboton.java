public class Resultadoboton {
    private void eventoResultado() {

        botones[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Al pulsar el botón de resultado, directamente lo calculo y reseteo la calculadora,
                //sin necesidad de almacenar el resultado para futuras operaciones
                resultado();
    
            }
        });
    
    }
}
