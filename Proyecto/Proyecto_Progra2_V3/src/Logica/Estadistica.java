package Logica;

import Entidades.Registro;
import java.util.List;
import javax.swing.JOptionPane;

public class Estadistica {

    public Double PromedioVentas(List<Registro> lista) {

        Double promedioVentas = 0.0;
        Double sumaTotal = 0.0;

        if (lista == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía", "Error de estadística", JOptionPane.WARNING_MESSAGE);
        } else {
            for (int i = 0; i < lista.size(); i++) {
                sumaTotal += lista.get(i).getVenta().getArticulo().getPrecio();
            }
            promedioVentas = sumaTotal / lista.size();
        }
        return promedioVentas;
    }

    public Double SumaTotal(List<Registro> lista) {
        Double sumaTotal = 0.0;
        if (lista == null) {
            JOptionPane.showMessageDialog(null, "Lista vacía", "Error de estadística", JOptionPane.WARNING_MESSAGE);
        } else {
            for (int i = 0; i < lista.size(); i++) {
                sumaTotal += lista.get(i).getVenta().getArticulo().getPrecio();
            }
        }
        return sumaTotal;
    }

}
