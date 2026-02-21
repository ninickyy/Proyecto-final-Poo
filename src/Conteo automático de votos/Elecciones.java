package modelo;

public class Elecciones {

    private String fecha;
    private String tipoDeEleccion;
    private Candidato[] candidatos;

    public Elecciones(String fecha, String tipoDeEleccion, Candidato[] candidatos) {
        this.fecha = fecha;
        this.tipoDeEleccion = tipoDeEleccion;
        this.candidatos = candidatos;
    }

    public String verInfo() {
        return "Fecha: " + fecha +
               "\nTipo de elección: " + tipoDeEleccion;
    }

    public String GenerarInforme() {
        String informe = "=== INFORME DE ELECCIÓN ===\n";
        informe += "Fecha: " + fecha + "\n";
        informe += "Tipo: " + tipoDeEleccion + "\n";
        informe += "Candidatos:\n";

        for (Candidato c : candidatos) {
            informe += c.verInfo() + "\n";
        }

        return informe;
    }
}
