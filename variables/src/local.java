public class local {
    public static void main(String[] args) {
        String h;//esta variable solo resonde en esta seccion no podra responder en otra seccion anoser que la llamemos y aqui es donde iniciamos la declaracion
        h="Variables locales";
//en la de aqui abajo la inicializamos 
        System.out.println(h);

        local v1= new local();
        v1.saludo("Abraham");
    }

public void saludo(String nombre){
    System.out.println(nombre.length());
    System.out.println("hola"+nombre);
}

}


