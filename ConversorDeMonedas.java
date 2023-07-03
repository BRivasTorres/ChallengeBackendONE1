import javax.swing.JOptionPane;

public class ConversorDeMonedas {

    public static void main(String[] args) {
        String cantidadStr;
        int cantidad = 0;
        Boolean esNumero = false;
        do {
            cantidadStr = JOptionPane.showInputDialog(null, "Ingrese una cantidad numerica");
            if (cantidadStr.matches("\\d+")) {
                cantidad = Integer.parseInt(cantidadStr);
                esNumero = true;
            } else {
                JOptionPane.showMessageDialog(null, "Deve ingresar solamente numeros");
            }
        } while (!esNumero);
        JOptionPane.showMessageDialog(null, "La cantidad ingresada es: " + cantidad);
    }
}
