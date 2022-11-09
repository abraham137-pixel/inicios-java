package interativas;

import java.util.Scanner;



public class Interativas {
    // RECUERDA Ponerlo fuera de una clase sino no reconocera a pepito y no te permitira trabajar 
    private Scanner pepito = new Scanner(System.in);
    public Interativas(String nombre){

        System.out.println("hola"+nombre+"desde el constructor interactivo");
    }
    public int e2suma(){
        System.out.println("Ingresa un numero:  ");
        int n = pepito.nextInt();
        int suma = 0;
        for (int i=1;i<=n;i++){
            suma+=1;
        }
        return suma;
    }
}
