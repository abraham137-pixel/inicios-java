package condicionales;
// recuerda importar las cosas para que funcionaen sino te las marcan como error
import java.util.Scanner;

public class Condicionales {
    //variable de instancia
private Scanner sc = new Scanner(System.in);

    //constructor es el metodo se ejecuta al crear un objeto
    public Condicionales(String nombre) {
        System.out.print("hola "+nombre+" mundo desde el constructor");
        //inicializar variables
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
}
