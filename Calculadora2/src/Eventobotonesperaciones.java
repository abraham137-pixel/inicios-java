public class Eventobotonesperaciones {
    import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* MODIFICAR */

private void eventosOperaciones() {

    for (int numBoton : operacionesBotones) { //Es la versión optimizada de for (int i = 0; i < operacionesBotones.length; i++){
        botones[numBoton].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Si no tenía ninguna operación pendiente de realizar
                if (operacion.equals("")) {
                    //Asocio la operación del botón a la variable
                    operacion = textoBotones[numBoton];
                    //Asigno a operando2 el valor del display (como double)
                    operando2 = Double.parseDouble(display.getText());
                    //Reseteo para poder introducir otro número y otro decimal
                    nuevoNumero = true;
                    puntoDecimal = false;
                //Si tenía alguna pendiente, calculo el resultado de la anterior y luego me guardo la actual
                } else {
                    operando2 = resultado(); //Se almacena en operando2 para poder encadenar operaciones posteriores
                    operacion = textoBotones[numBoton];
                }
                //SOUT para comprobar que estoy guardando los valores adecuados
                System.out.println(operando2 + " " + operacion + " " + operando1);

            }
        });
    }

}

/* AÑADIR COMO NUEVOS MÉTODOS */

// Calcula el resultado en función de la operación seleccionada y lo devuelve formateado en el display
private double resultado(){

    //recojo el valor del display
    operando1 = Double.parseDouble(display.getText());

    //Selecciono y realizo operación
    switch (operacion){

        case "+" :  resultado = operando2 + operando1;
            break;
        case "-" :  resultado = operando2 - operando1;
            break;
        case "*" :  resultado = operando2 * operando1;
            break;
        case "/" :  resultado = operando2 / operando1;
            break;

    }

    //Formateo y muestro en el display
    Locale localeActual = Locale.GERMAN;
    DecimalFormatSymbols simbolos = new DecimalFormatSymbols(localeActual);
    simbolos.setDecimalSeparator('.');
    DecimalFormat formatoResultado = new DecimalFormat("#.######", simbolos);
    display.setText(String.valueOf(formatoResultado.format(resultado)));

    //Limpio variables para poder continuar
    limpiar();

    //Devuelvo el valor del resultado
    return resultado;

}

//Resetea los valores de la calculadora para poder continuar haciendo operaciones
private void limpiar(){

    operando1 = operando2 = 0;
    operacion = "";
    nuevoNumero = true;
    puntoDecimal = false;
}
}
