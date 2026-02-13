package Modelo;

public class ActaElectoral {

    private String numeroActa;
    private Candidato[] candidatos;
    private int totalCandidatos;
    private int votosBlancos;
    private int votosNulos;
    private int totalVotantes;

    public ActaElectoral() {
        numeroActa = "";
        candidatos = new Candidato[20];
        totalCandidatos = 0;
        votosBlancos = 0;
        votosNulos = 0;
        totalVotantes = 0;
    }

    public ActaElectoral(String numeroActa) {
        this.numeroActa = numeroActa;
        candidatos = new Candidato[20];
        totalCandidatos = 0;
        votosBlancos = 0;
        votosNulos = 0;
        totalVotantes = 0;
    }

    public void agregarCandidato(Candidato c) {
        if (totalCandidatos < candidatos.length) {
            candidatos[totalCandidatos] = c;
            totalCandidatos++;
        }
    }

    public void registrarVoto(int pos) {
        if (pos >= 0 && pos < totalCandidatos) {
            candidatos[pos].sumarVoto();
            totalVotantes++;
        }
    }

    public void registrarVotoPreferencial(int pos) {
        if (pos >= 0 && pos < totalCandidatos) {
            candidatos[pos].sumarVotoPreferencial();
            totalVotantes++;
        }
    }

    public void registrarVotoBlanco() {
        votosBlancos++;
        totalVotantes++;
    }

    public void registrarVotoNulo() {
        votosNulos++;
        totalVotantes++;
    }

    public int getTotalVotantes() {
        return totalVotantes;
    }

    public int getVotosBlancos() {
        return votosBlancos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void mostrarResultados() {
        System.out.println("Acta: " + numeroActa);

        for (int i = 0; i < totalCandidatos; i++) {
            candidatos[i].mostrarDatos();
            System.out.println("-------------------");
        }

        System.out.println("Blancos: " + votosBlancos);
        System.out.println("Nulos: " + votosNulos);
        System.out.println("Total Votantes: " + totalVotantes);
    }
}
