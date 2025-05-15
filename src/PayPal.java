public class PayPal implements PagoConDescuento{
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Descuento por PayPal: "+porcentaje+"%");
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago con PayPal de: $"+monto);
    }
}
