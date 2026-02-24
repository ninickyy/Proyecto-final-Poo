package modelo;
import modelo.*;

public class ReporteElectoral {

    
    
    public void generarReportePorMesa(MesaElectoral m) {
        m.verInfo();
    }

    public void generarReportePorEleccion(Eleccion e) {
        System.out.println("=== REPORTE POR ELECCION ===");
        e.verInfo();
    }

    public void generarReportePorActa(ActaElectoral a) {
        a.verInfo();
    }
}