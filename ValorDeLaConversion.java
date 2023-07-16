import javax.swing.JOptionPane;

public class ValorDeLaConversion {
    public static void ValorFinal(double cantidad, double cambio) {
        double cantidadFinal = cantidad * cambio;
        JOptionPane.showMessageDialog(null, "Tienes " + cantidadFinal);
        DeseContinuar deseContinuar = new DeseContinuar();
        deseContinuar.Continuar();
    }
}
