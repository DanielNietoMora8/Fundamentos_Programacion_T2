import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese kilometros: ");
        double kilometros = sc.nextDouble();
        ArrayList<Double> conversiones = new ArrayList<Double>();
        conversiones = Utilidades.convertir_unidad(kilometros);
        System.out.println("El resultado en metros es: "+conversiones.get(0));
        System.out.println("El resultado en centímetros es: "+conversiones.get(1));
        System.out.println("El resultado en millas es: "+conversiones.get(2));

    }
}
