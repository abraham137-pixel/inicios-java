public class Matriz {

    public static void main(String[] args) {
        
        char Matriz[] = {'h','o','l','a'};
    
        int matriz2[][] = {{1,2,3},{4,5,6}};
        int[][] matrizClone = matriz2.clone();
        System.out.println(matriz2 == matrizClone); //falso
        System.out.println(matriz2[0] == matrizClone[0]); //verdadero
}
    }
   
