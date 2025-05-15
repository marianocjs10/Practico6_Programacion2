public class Pedido1 {
    private Cliente cliente;
    private String estado;

    public Pedido1(Cliente cliente, String estado) {
        this.cliente = cliente;
        this.estado = estado;
    }

    public void cambiarEstado(String nuevoEstado){
        this.estado = nuevoEstado;
        this.cliente.notificar("El estado se cambió a '"+nuevoEstado+"'");
    }
}
