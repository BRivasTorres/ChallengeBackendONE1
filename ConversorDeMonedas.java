import javax.swing.JOptionPane;

public class ConversorDeMonedas {

    public static void Convertir() {
        double tasaCambio = 7.85;
        String cantidadStr;
        int cantidad = 0;
        Boolean esNumero = false;
        do {
            cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir");
            if (cantidadStr.matches("\\d+")) {
                cantidad = Integer.parseInt(cantidadStr);
                esNumero = true;
            } else {
                JOptionPane.showMessageDialog(null, "Deve ingresar solamente numeros");
            }
        } while (!esNumero);
        double resultadoCantidad = tasaCambio * cantidad;
        JOptionPane.showMessageDialog(null, "La cantidad ingresada es: " + resultadoCantidad);
    }

}
