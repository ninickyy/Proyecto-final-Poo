
package modelo;

public class ActaElectoral {

    private int numeroActa;
    private String titulo;
    private String fecha;
    private Voto[] votos;
    private int totalVotos;
    private String observaciones;
    private String firma;
    private String selloOficial;

    public ActaElectoral(int numeroActa, String titulo, String fecha,
                         String observaciones, String firma, String selloOficial) {
        this.numeroActa = numeroActa;
        this.titulo = titulo;
        this.fecha = fecha;
        this.votos = new Voto[500];
        this.totalVotos = 0;
        this.observaciones = observaciones;
        this.firma = firma;
        this.selloOficial = selloOficial;
    }

    public void AgregarVoto(Voto v) {
        votos[totalVotos] = v;
        totalVotos++;
    }

    public void modificarVoto(Voto v) {
        for (int i = 0; i < totalVotos; i++) {
            if (votos[i] == v) {
                votos[i] = v;
            }
        }
    }

    public int ContarVotos() {
        return totalVotos;
    }

    public int ContarVotosPorTipo(String tipo) {
        int contador = 0;
        for (int i = 0; i < totalVotos; i++) {
            if (votos[i].getTipo().equals(tipo)) {
                contador++;
            }
        }
        return contador;
    }

    public int VotosPorCandidato(Candidato c) {
        int contador = 0;
        for (int i = 0; i < totalVotos; i++) {
            if (votos[i].getCandidato() == c) {
                contador++;
            }
        }
        return contador;
    }

    public int contarVotosPreferenciales() {
        int contador = 0;
        for (int i = 0; i < totalVotos; i++) {
            if (votos[i].isPreferencial()) {
                contador++;
            }
        }
        return contador;
    }

    public void CalcularResultado() {
        System.out.println("Total votos: " + ContarVotos());
        System.out.println("Votos blancos: " + ContarVotosPorTipo("BLANCO"));
        System.out.println("Votos nulos: " + ContarVotosPorTipo("NULO"));
        System.out.println("Votos preferenciales: " + contarVotosPreferenciales());
    }

    public String GenerarInforme() {
        return "Acta N°: " + numeroActa +
               "\nTitulo: " + titulo +
               "\nFecha: " + fecha +
               "\nTotal votos: " + totalVotos;
    }
}
