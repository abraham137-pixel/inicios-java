public class calculadora{
    private String display;
    private Double resultado;
    private Queue<String> cola = new LinkedList<String>();

    public calculadora(){
        display ="";
        resultado =0.0;
    }
    private void suma(Double n){
        resultado+= n;
    }
    private void resta(Double n){
        resultado-=n;
    }
    private void multiplicacion(Double n){
        resultado*=n;
    }
    private void division(Double n){
        resultado/=n;
    }
    private void pasarACola(String pantalla){
         cola = new LinkedList<String>();
        String aux = "";
        char elemento = '';
        for (int i=0; i<pantalla.lehgth();i++){
            elemento = pantalla.charAT(i);
            if(elemento!='+'&&'-'&&'*'&&'/'){
                
            }
        }
    }
}