public class sucesion {
    public static void main(String[] args) {
        int x1=0,x2=1,x3;
        System.out.print("0,1");
        for (int i = 2; i <15; i++) {
            x3=x1+x2;
            System.out.print(","+x3);
            x1=x2;
            x2=x3;
            
        }
    }
}
