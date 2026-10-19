import java.util.ArrayList;
import java.util.Scanner;

public class Utilidades {

    public static void dialogo() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int n_pares = 0;
        int n_impares = 0;
        int n_positivos = 0;
        int n_negativos = 0;

        do {
            System.out.println("Ingrese un número para verificar o 0 para salir");
            numero = sc.nextInt();

            if (numero > 0) {
                n_positivos++;
            } else if (numero < 0) {
                n_negativos++;
            }

            if (numero % 2 == 0) {
                n_pares++;
            } else {
                n_impares++;
            }


        }
        while (numero != 0);

        System.out.println("El numero de pares fue: "+n_pares+"\nEl numero de impares fue: "+n_impares);
        System.out.println("El numero de positivos fue: "+n_positivos+"\nEl numero de negativos fue: "+n_negativos);
    }

}
