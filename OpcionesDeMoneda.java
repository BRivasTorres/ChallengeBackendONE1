import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.RowFilter.Entry;

public class OpcionesDeMoneda {
    public static void main(String[] args) {
        Map<String, Double> cambios = new HashMap<>();
        cambios.put("De QGT a Dolares", .13);
        cambios.put("De QGT a Euro", .12);
        cambios.put("De QGT a Libras Esterlinas", .10);
        cambios.put("De QGT a Yen Japones", 18.27);
        cambios.put("De QGT a Won", 166.93);
        cambios.put("De Dolares a QGT", 7.84);
        cambios.put("De Euro a QGT", 8.82);
        cambios.put("De Libras Esterlinas a QGT", 10.27);
        cambios.put("De Yen Japones a QGT", 0.057);
        cambios.put("De Won a QGT", 0.0062);

        String monedas[] = cambios.keySet().toArray(new String[0]);

        JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir su dinero", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null,
                monedas, monedas[0]);
    }
}
