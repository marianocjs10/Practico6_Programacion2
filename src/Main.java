import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /* Parte 1 */
        Pedido pedido = new Pedido();
        pedido.addProducto(new Producto("Teclado",100));
        pedido.addProducto(new Producto("Mouse",80));
        pedido.addProducto(new Producto("Monitor",700));
        System.out.println("El total del pedido es: $"+pedido.calcularTotal());
        System.out.println();

        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(7290);
        PayPal payPal = new PayPal("mariano@gmail.com");
        tarjetaDeCredito.aplicarDescuento(10.0);
        tarjetaDeCredito.procesarPago(880.00);
        payPal.aplicarDescuento(5.0);
        payPal.procesarPago(500.0);
        System.out.println();

        Cliente cliente1 = new Cliente("Mariano", "mariano@gmail.com");
        Pedido1 pedido1 = new Pedido1(cliente1,"Pendiente");
        pedido1.cambiarEstado("Enviado");

        /* Parte 2 */
        System.out.println();
        System.out.println("---- Parte Dos ----");
        System.out.println();
        ParteDos.ejercicioUno();
        System.out.println();

        ParteDos.ejercicioDos();
        System.out.println();

        String rutaDelArchivo1 = "C:/Users/buitr/OneDrive/Desktop/Programacion/Primero_Utn/Segundo_Semestre/Programacion_2/ResolucionDePracticos/Practico6_Programacion2/src/texto1";
        ParteDos.ejercicioTres(rutaDelArchivo1);
        System.out.println();

        System.out.println("Ingrese la edad, entre 0 y 120: ");
        try {
            ParteDos.ejercicioCuatro(new Scanner(System.in).nextInt());
        }catch (EdadInvalidaException ei){
            System.out.println("Error al ingresar la edad: "+ ei.getMessage());
        }
        System.out.println();

        String rutaConError = "C:/Users/buitr/OneDrive/Desktop/Programacion/Primero_Utn/Segundo_Semestre/Programacion_2/ResolucionDePracticos/Practico6_Programacion2/src/texto";
        ParteDos.ejercicioCinco(rutaConError);
        System.out.println();
        String rutaSinError = "C:/Users/buitr/OneDrive/Desktop/Programacion/Primero_Utn/Segundo_Semestre/Programacion_2/ResolucionDePracticos/Practico6_Programacion2/src/texto2";
        ParteDos.ejercicioCinco(rutaSinError);
    }
}