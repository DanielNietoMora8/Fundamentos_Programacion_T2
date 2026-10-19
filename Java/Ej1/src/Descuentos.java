import java.util.ArrayList;

public class Descuentos {
    public static ArrayList<Double> calculo_descuentos(int n_productos, double valor_producto, double descuento){
        ArrayList<Double> resultados = new ArrayList<>();
        double sub_total = valor_producto*n_productos;
        double descontado = sub_total*descuento/100;
        double total = sub_total - descontado;
        resultados.add(sub_total);
        resultados.add(total);
        resultados.add(descontado);
        return resultados;
    }
}
