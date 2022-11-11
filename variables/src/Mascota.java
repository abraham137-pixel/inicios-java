public class Mascota {

    public Mascota(String string, String string2, String string3) {
    }

    public static int sumaArreglo(int[] arreglo){
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma+=arreglo[i];
        }
        return suma;
    }

    public static int[] matrizAB(int inicio, int fin){
        int tamaño = fin - inicio + 1;
        int arreglo[] = new int[tamaño];
        for(int i = 0;i<arreglo.length;i++){
            arreglo[i] = inicio+i;
        }
        return arreglo;
    }

    public static Mascota[] crearMascotas(String[][] mascotasDB){
        Mascota[] mascotas = new Mascota[mascotasDB.length];
        
        for(int i = 0;i<mascotas.length;i++){
            mascotas[i] = new Mascota(mascotasDB[i][0], mascotasDB[i][1], mascotasDB[i][2]);
        }
        return mascotas;
    }

    public static void imprimeMascota(Mascota[] mascota){
        for (Mascota m : mascota) {
            System.out.println("==============");
            System.out.println(m.toString());
        }
    }
}
    

