package Modelo;

public class RegistroActa {

    private String tituloDocumento;
    private String numeroActa;
    private String fecha;
    private String hora;
    private String lugar;
    private String identificacionMesa;

    private String[] miembrosMesa;
    private int totalMiembros;

    private String[] firmas;
    private int totalFirmas;

    private String observaciones;
    private String selloOficial;

    private Candidato[] candidatos;
    private int totalCandidatos;

    private int votosBlancos;
    private int votosNulos;
    private int totalVotantesRegistrados;
    private int totalVotantesEfectivos;

    public RegistroActa(String tituloDocumento, String numeroActa,
                         String fecha, String hora, String lugar,
                         String identificacionMesa,
                         int totalVotantesRegistrados) {

        this.tituloDocumento = tituloDocumento;
        this.numeroActa = numeroActa;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.identificacionMesa = identificacionMesa;
        this.totalVotantesRegistrados = totalVotantesRegistrados;

        miembrosMesa = new String[5];
        firmas = new String[5];
        candidatos = new Candidato[20];

        totalMiembros = 0;
        totalFirmas = 0;
        totalCandidatos = 0;
        votosBlancos = 0;
        votosNulos = 0;
        totalVotantesEfectivos = 0;
    }

    public void agregarMiembroMesa(String nombre) {
        if (totalMiembros < miembrosMesa.length) {
            miembrosMesa[totalMiembros] = nombre;
            totalMiembros++;
        }
    }

    public void agregarFirma(String firma) {
        if (totalFirmas < firmas.length) {
            firmas[totalFirmas] = firma;
            totalFirmas++;
        }
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
            totalVotantesEfectivos++;
        }
    }

    public void registrarVotoPreferencial(int pos) {
        if (pos >= 0 && pos < totalCandidatos) {
            candidatos[pos].sumarVotoPreferencial();
            totalVotantesEfectivos++;
        }
    }

    public void registrarVotoBlanco() {
        votosBlancos++;
        totalVotantesEfectivos++;
    }

    public void registrarVotoNulo() {
        votosNulos++;
        totalVotantesEfectivos++;
    }

    public void agregarObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void agregarSelloOficial(String sello) {
        this.selloOficial = sello;
    }

    public void mostrarActa() {

        System.out.println("=================================");
        System.out.println(tituloDocumento);
        System.out.println("Número de Acta: " + numeroActa);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Mesa: " + identificacionMesa);

        System.out.println("----- Miembros de Mesa -----");
        for (int i = 0; i < totalMiembros; i++) {
            System.out.println(miembrosMesa[i]);
        }

        System.out.println("Votantes Registrados: " + totalVotantesRegistrados);
        System.out.println("Votantes Efectivos: " + totalVotantesEfectivos);

        System.out.println("----- Resultados por Candidato -----");
        for (int i = 0; i < totalCandidatos; i++) {
            candidatos[i].mostrarDatos();
            System.out.println("-------------------");
        }

        System.out.println("Votos en Blanco: " + votosBlancos);
        System.out.println("Votos Nulos: " + votosNulos);

        System.out.println("Observaciones:");
        System.out.println(observaciones);

        System.out.println("----- Firmas -----");
        for (int i = 0; i < totalFirmas; i++) {
            System.out.println(firmas[i]);
        }

        System.out.println("Sello Oficial: " + selloOficial);
        System.out.println("=================================");
    }
}
