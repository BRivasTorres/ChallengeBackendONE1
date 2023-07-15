import javax.swing.JOptionPane;

public class MenuPrincipal {

    public static void main(String[] args) {
        Object[] opciones = { "Conversor de moneda", "Conversor de Temperatura" };

        String opcionSelecionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversor",
                "Menu", JOptionPane.PLAIN_MESSAGE, null, opciones,
                opciones[0]);
        if (opcionSelecionada.equals("Conversor de moneda")) {
            Cantidad cantidad = new Cantidad();
            cantidad.CantidadSeleccionada();
        }
    }
}
