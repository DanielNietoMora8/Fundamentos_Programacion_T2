import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n_productos = 0;
        double valor_producto = 0;
        double descuento = 0;
        ArrayList<Double> resultados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número de productos");
        n_productos = sc.nextInt();
        System.out.println("Ingrese valor de producto");
        valor_producto = sc.nextDouble();
        System.out.println("Ingrese descuento");
        descuento = sc.nextDouble();

        resultados = Descuentos.calculo_descuentos(n_productos, valor_producto, descuento);
        System.out.println("El valor total es: "+resultados.getFirst()+"\nEl valor descontado es: "+resultados.getLast());
        System.out.println("El valor a pagar es: "+resultados.get(1));

    }
}
