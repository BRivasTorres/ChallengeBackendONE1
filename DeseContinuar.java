import javax.swing.JOptionPane;

public class DeseContinuar {
    public static void Continuar() {

        int option = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Seleccione una Opción",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.YES_OPTION) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.menu();
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Finalizado", JOptionPane.PLAIN_MESSAGE);
        } else if (option == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa Finalizado", "Finalizado", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
