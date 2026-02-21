package modelo;

public class Elecciones {

    private String fecha;
    private String tipoDeEleccion;
    private Candidatos[] Candidatos;

    public Elecciones(String fecha, String tipoDeEleccion, Candidatos[] Candidatos) {
        this.fecha = fecha;
        this.tipoDeEleccion = tipoDeEleccion;
        this.Candidatos = Candidatos;
    }

    public String VerInfo() {
        return "Fecha: " + fecha + " Tipo: " + tipoDeEleccion;
    }

    public String GenerarInforme() {
        return "Informe generado de la elección.";
    }
}
