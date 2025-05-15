public class TarjetaDeCredito implements PagoConDescuento{
    private int numeroTarjeta;

    public TarjetaDeCredito(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Se aplicó un decuento del: "+porcentaje+"% por tarjeta");
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago con tarjeta de $"+monto);
    }
}
