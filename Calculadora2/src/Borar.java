public class Borar {
    private void eventoLimpiar() {

        botones[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Al pulsar el botón de limpiar, se resetean el display y las variables de la calculadora,
                display.setText("0");
                limpiar();
            }
        });
    }
}
