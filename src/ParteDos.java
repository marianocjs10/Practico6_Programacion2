import java.io.*;
import java.util.Scanner;

public class ParteDos {
    public static void ejercicioUno(){
        int num1, num2;
        try {
            System.out.println("Ingrese el primer número entero: ");
            num1 = new Scanner(System.in).nextInt();
            System.out.println("Ingrese el segundo número entero: ");
            num2 = new Scanner(System.in).nextInt();
            System.out.println("El resultado de la división de los números es: "+num1 / num2);;
        }catch (ArithmeticException ae) {
            System.out.println("No es posible dividir por cero. "+ ae.getMessage());
        }
    }

    public static void ejercicioDos(){
        Scanner sc= new Scanner(System.in);
        Integer textoANum; String texto;
        try {
            System.out.println("Ingrese un texto1: ");
            texto = sc.nextLine();
            textoANum = Integer.parseInt(texto);
            System.out.println("El texo: '"+textoANum +"' se convirtio a un: " + textoANum.getClass().getSimpleName());
        }catch (NumberFormatException nf){
            System.out.println("Esta cadena no se puede convertir a entero. "+ nf.getMessage());
        }
    }

    public static void ejercicioTres (String ruta) /*throws IOException*/{
        File archivo = new File(ruta);
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(archivo));
            System.out.println(br.readLine());
        }catch (FileNotFoundException fnf){
            System.out.println("No se encontró el archivo.");
        }catch(IOException ioe){
            System.out.println("Ocurrió un problema al leer el archivo.");
        }
    }

    public static void ejercicioCuatro(int num){
        if(num < 0 || num > 120){
            throw new EdadInvalidaException("La edad debe ser mayor que 0 y menor que 120.");
        }
        System.out.println("Edad ingresada: "+ num);
    }

    public static void ejercicioCinco(String ruta){
        File archivo = new File(ruta);
        try(BufferedReader br= new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }catch(IOException ioe){
            System.out.println("Ocurrió un problema al leer el archivo.");
        }
    }

}
