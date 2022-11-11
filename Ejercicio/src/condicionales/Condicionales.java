package condicionales;
// recuerda importar las cosas para que funcionaen sino te las marcan como error
import java.util.Scanner;

public class Condicionales {
    //variable de instancia
public Scanner sc = new Scanner(System.in);

    //constructor es el metodo se ejecuta al crear un objeto
    public Condicionales(String nombre) {
        System.out.print("hola "+nombre+" mundo desde el constructor");
        //inicializar variables
        // metodo que se ejecuta cunado creo un objeto cuando uso new
    }
    public Condicionales() {
    }
// privacidad tipo de retorno nombre de la funcion o metodo
public String saludo(){
    //entrada
    System.out.print("Ingresa tu edad");
    int edad = sc.nextInt();
    //verificar si es mayor de edad
    if(edad>=18){ // edad>17
        return "Eres mayor de edad";//sentencia de salto(jump)
    }else{
        return "Eres menor de edad";

    }
}


public String e2Contrasenia(String passBD){
    System.out.println("ingresa la contraseña:  ");
    String pass = sc.nextLine();
    return pass.equals(passBD)?"La contraseña es correcta":"La contraseña es incorrecta";

}
// escribir un programa que pida dos numeros al usuario  y que relaizen una
//division den cero el prgograma mostrara error
/**
 * @return
 */
public static String e3(double ) {
    System.out.println("dame un dividendo: ");
    double dividendo = sc.nextDouble();
    System.out.println("dame un divisor: ");
    double divisor = sc.nextDouble();
    if(divisor!=0){
        return"ladivision de "+dividendo+"/"+divisor+"="+(dividendo/divisor);
        {else}
        return"Error el divosro es CERO!!";

    }

}
public  static int  () {
    System.out.println("Dame un numero ");
    int pares = sc.nextInt();
    int impares= sc.nextInt();
    if(pares=7){
        return "Es de los pares";
    }else{
        return "Es de los impares";
    }



    

    

    
}
}
