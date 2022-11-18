import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Mascotas2> listamascotas = new ArrayList<Mascotas2>();
        listamascotas.add(new Mascotas2("tony", 2, "buldocers", "mediano", "juan"));
        listamascotas.add(new Mascotas2("snupi", 5, "pastor", "mediano", "jose"));
        listamascotas.add(new Mascotas2("coco", 1, "galgo", "grande", "dana"));
        System.out.println(listamascotas.size());

    }
}
