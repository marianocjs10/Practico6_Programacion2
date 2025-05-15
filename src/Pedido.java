import java.util.ArrayList;

public class Pedido implements Pagable{
    private ArrayList<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto){
        this.productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double suma=0;
        for(Producto p : this.productos){
            suma+= p.calcularTotal();
        }
        return suma;
    }
}
