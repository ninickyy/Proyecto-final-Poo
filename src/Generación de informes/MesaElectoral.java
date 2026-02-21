package modelo;

public class MesaElectoral {

    private String idMesa;
    private String lugar;
    private int nroVotantesRegistrados;
    private int nroVotantesEfectivos;
    private String resultado;

    public MesaElectoral(String idMesa, String lugar, int nroVotantesRegistrados, int nroVotantesEfectivos, String resultado) {
        this.idMesa = idMesa;
        this.lugar = lugar;
        this.nroVotantesRegistrados = nroVotantesRegistrados;
        this.nroVotantesEfectivos = nroVotantesEfectivos;
        this.resultado = resultado;
    }

    public void AsignarMiembro(MiembroDeMesa m) {
    }

    public String GenerarInforme() {
        return "Informe de mesa " + idMesa;
    }
}
