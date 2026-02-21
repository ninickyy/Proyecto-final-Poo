package modelo;

public class MesaElectoral {

    private String idMesa;
    private String lugar;
    private int nroVotantesRegistrados;
    private int nroVotantesEfectivos;
    private String resultado;

    public MesaElectoral(String idMesa, String lugar,
                          int registrados, int efectivos,
                          String resultado) {
        this.idMesa = idMesa;
        this.lugar = lugar;
        this.nroVotantesRegistrados = registrados;
        this.nroVotantesEfectivos = efectivos;
        this.resultado = resultado;
    }

    public void AsignarMiembro(MiembroDeMesa m) {
        // Según UML solo existe el método, no indica estructura interna
    }

    public String GenerarInforme() {
        return "=== INFORME MESA ELECTORAL ===\n" +
               "ID Mesa: " + idMesa + "\n" +
               "Lugar: " + lugar + "\n" +
               "Votantes Registrados: " + nroVotantesRegistrados + "\n" +
               "Votantes Efectivos: " + nroVotantesEfectivos + "\n" +
               "Resultado: " + resultado;
    }
}
