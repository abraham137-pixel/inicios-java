import java.security.Key;

public class Ordenamiento {
    // recuerda el metodo empieza por el tipo que sera si es publico pirvado y sisera estatico tambien pones lo que devolvera
    public static void burbuja(int[] arrays){
        //no olvides dejarle el . lenght sino es como decirle que en un arreglo de 10 lo convierta en uno de 8
        for (int i = 0; i < arrays.length-2; i++) {
            for (int j = 0; j <= arrays.length-i-2; j++) {
                if (arrays[j]>(arrays[j+i])) {
                    int aux = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+i]= aux;
                    
                }
            }
            
        }

    }

    public static void insercion(int arrays[]){
        // TODO EN espera de terminar for (int i = 0; i < arrays.length; i++) {
        // TODO EN espera de terminar    int Key = i; 
        // TODO EN espera de terminar    int ant =i-1;
        // TODO EN espera de terminar    int aux;
        // TODO EN espera de terminar    while (condition:var(boolean)) {
            
           }
            //whhile ( int ant > = 0; arrays[Key] < arrays [ant];  i++) {
            //   int aux = arrays [Key];
            //   arrays[i]= aux;
            //   Key = i ;
            //   i--;
                
           // }
            
        //}
    //}
    
    public static void quicksort(int[]arrays, int iza, int der){
        int pivote= arrays[iza];
        int  i = iza ;
        int d = der;
        int aux;
        while (i<d) {
            while (arrays[i]<=pivote && i<d) i++; {
                while (arrays[d]>pivote)d--; {
                    if (i<d) {
                        aux= arrays[i];
                        arrays[i]=arrays[d];
                        arrays[d]=aux;
                        
                    }
                    
                }
                // en esta parte de abajo se cambian los lados de pivote para organizar la lista
                arrays[i]=arrays[d];
                arrays[d]= pivote;
                return d;
                {quicksort(arrays, iza, d-1);
                    if (d+i<der) {
                        quicksort(arrays, d+1, der);
                        
                    }

                }
            }
        }
        
    }
}