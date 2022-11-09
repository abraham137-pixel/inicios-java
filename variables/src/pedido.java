public class pedido {
    
    public static void main(String[] args) {
        double costo=300.99;
        boolean listoentregar=false;

        System.out.print(costo>24);
        System.out.print("precio");

        double costoArticulo = 30.99;
        boolean listoEnviar = false;
        System.out.println(costoArticulo >24?"precio alto:":"precio bajo");
        System.out.println(listoEnviar?"listo para enviar":"pedido no listo");
        
        
    }
}
