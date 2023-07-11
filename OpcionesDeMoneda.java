import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.RowFilter.Entry;

public class OpcionesDeMoneda {
    public static void main(String[] args) {
        Map<String, Double> cambios = new HashMap<>();
        cambios.put("Dolares", .13);
        cambios.put("Euro", .12);
        cambios.put("Libras Esterlinas", .10);
        cambios.put("Yen Japones", 18.27);
        cambios.put("Won", 166.93);

        String monedas[] = {};

        // for (Map.Entry<String, Double> entry : cambios.entrySet()) {
        // monedas[] = { entry.getKey() };
        // }

        // JOptionPane.showInputDialog(null, "Elija moneda", "Elija moneda", 0, null,
        // monedas, monedas[0]);
    }

    // public static void Conversor(int cantidad, String tipo) {

    // Map<String, Double> cambios = new HashMap<>();
    // cambios.put("Dolares", .13);
    // cambios.put("Euro", .12);
    // cambios.put("Libras Esterlinas", .10);
    // cambios.put("Yen Japones", 18.27);
    // cambios.put("Won", 166.93);

    // for (Map.Entry<String, Double> entry : cambios.entrySet()) {
    // System.out.println(entry.getKey());
    // }

    // }
}
