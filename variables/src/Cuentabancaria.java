public class Cuentabancaria {
    public static void main(String[] args) {
        double saldo=1000.75;
        double cantidadretirada=250;
        double saldoActualizado;
        saldoActualizado=saldo-cantidadretirada;
        double contpca=saldoActualizado/3;
        boolean puedeComprar=contpca>250?true:false;
        System.out.print(puedeComprar);
        System.out.print("Le di a cada amigo <cantidadParaCadaAmigo>"+ contpca);
    }
}
