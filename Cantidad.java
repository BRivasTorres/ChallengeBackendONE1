import javax.swing.JOptionPane;

public class Cantidad {

    public static void CantidadSeleccionada() {
        String cantidadStr;
        Boolean esNumero = false;
        do {
            cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir");
            if (cantidadStr.matches("\\d+")) {
                esNumero = true;
            } else {
                JOptionPane.showMessageDialog(null, "Deve ingresar solamente numeros");
            }
        } while (!esNumero);
        JOptionPane.showMessageDialog(null, "La cantidad ingresada es: " + cantidadStr);
    }

}
