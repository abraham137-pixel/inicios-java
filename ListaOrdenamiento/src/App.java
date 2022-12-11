import java.util.Arrays;

public class App {
    //recuerda los [] solo van al inicio o al fnal sino te saldra como un error
    static int listadesordenada[] = {1,8,2,6,7,5,9,4,3,15};
    public static void main(String[] args) throws Exception {
        //System.out.println(Arrays.toString(listadesordenada));
        //Ordenamiento.burbuja(listadesordenada);
        //System.out.println(Arrays.toString(listadesordenada));
        System.out.println(Arrays.toString(quicksort));
        Ordenamiento.quicksort(listadesordenada, 0, listadesordenada.length-1);
        System.out.println(Arrays.toString(listadesordenada));
    }
    
}
