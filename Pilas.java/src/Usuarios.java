import java.util.LinkedList;
import java.util.Queue;

public class Usuarios {
    public static void main(String[] args) {
        Queue<String> usuario =new LinkedList<String>();

        usuario.add("jose");
        usuario.add("maria");
        usuario.add("carlos");
        usuario.add("eva");
        usuario.add("juan");


        System.out.println(usuario.remove());
        System.out.println(usuario.remove());
        System.out.println(usuario.remove());
        
        System.out.println("Usuario a eliminar");
    }
}
