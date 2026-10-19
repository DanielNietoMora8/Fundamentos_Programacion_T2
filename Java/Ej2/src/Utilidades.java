import java.util.ArrayList;

public class Utilidades {
    public static ArrayList<Double> convertir_unidad(double kilometros)
    {
        ArrayList<Double> resultado = new ArrayList<>();
        resultado.add(kilometros*1000);
        resultado.add(kilometros*100000);
        resultado.add(kilometros*0.621371);
        return resultado;
    }
}
