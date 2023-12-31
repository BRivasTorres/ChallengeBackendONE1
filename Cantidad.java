import javax.swing.JOptionPane;

public class Cantidad {

    public void CantidadSeleccionada() {
        String cantidadStr;
        Boolean esNumero = false;
        do {
            cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir");
            if (cantidadStr.matches("\\d+")) {
                esNumero = true;
            } else {
                JOptionPane.showMessageDialog(null, "Valor no Valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!esNumero);

        double cantidad = Double.parseDouble(cantidadStr);
        OpcionesDeMoneda opcionesDeMoneda = new OpcionesDeMoneda();
        opcionesDeMoneda.Cambios(cantidad);
    }
}
