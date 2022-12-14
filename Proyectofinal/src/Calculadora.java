import java.util.LinkedList;
import java.util.Queue;

import javax.lang.model.element.Element;
import javax.swing.text.DefaultCaret;

import java.awt.*;
public class Calculadora{
    private String display;
    private Double resultado;
    private Queue<String> cola = new LinkedList<String>();
    
    public Calculadora(){
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
        char elemento = ' ';
        for (int i=0; i<pantalla.length();i++){
            elemento = pantalla.charAt(i);
            if(elemento!='+'&& elemento!='-'&&elemento!='*'&&elemento!='/'){
                aux+=elemento;
            }else{
                cola.add(aux);
                cola.add(Character.toString(elemento));
                aux="";}}
            }

            
            public Double resultadodisplay(String pantalla){
                pasarACola(pantalla);
                suma(Double.parseDouble(cola.poll()));
                while(!cola.isEmpty())
                switch (cola.poll()) {
                    case "+":
                    suma(Double.parseDouble(cola.poll()));
                    default:
                    break;
                    
                }
                return resultado;

            }
            public void reiniciar(){
                this.resultado=0.0;
                this.cola.clear();
        }
        }
    //}
//}