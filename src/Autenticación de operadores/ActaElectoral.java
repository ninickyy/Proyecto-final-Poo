package Modelo;

public class ActaElectoral {

    private int numeroActa;
    private String titulo;
    private String fecha;
    private String hora;
    private int votosEmitidos;
    private int votosPreferenciales;
    private int votosBlanco;
    private int votosNulos;
    private String observaciones;
    private String firma;
    private String selloOficial;

    public ActaElectoral(int numeroActa, String titulo,
                         String fecha, String hora,
                         int votosEmitidos,
                         int votosPreferenciales,
                         int votosBlanco,
                         int votosNulos,
                         String observaciones,
                         String firma,
                         String selloOficial) {

        this.numeroActa = numeroActa;
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.votosEmitidos = votosEmitidos;
        this.votosPreferenciales = votosPreferenciales;
        this.votosBlanco = votosBlanco;
        this.votosNulos = votosNulos;
        this.observaciones = observaciones;
        this.firma = firma;
        this.selloOficial = selloOficial;
    }

    public void AgregarVoto(Voto v) {
        votosEmitidos += v.total;
    }

    public int ContarVotos() {
        return votosEmitidos;
    }

    public int ContarVotosPorTipo(String tipo) {
        if (tipo.equals("Preferencial")) return votosPreferenciales;
        if (tipo.equals("Blanco")) return votosBlanco;
        if (tipo.equals("Nulo")) return votosNulos;
        return 0;
    }

    public int VotosPorCandidato(Candidatos candidato) {
        return 0;
    }

    public void CalcularResultado() {
    }

    public String GenerarInforme() {
        return "Acta N° " + numeroActa +
               "\nTitulo: " + titulo +
               "\nFecha: " + fecha +
               "\nHora: " + hora +
               "\nVotos Emitidos: " + votosEmitidos +
               "\nPreferenciales: " + votosPreferenciales +
               "\nBlanco: " + votosBlanco +
               "\nNulos: " + votosNulos;
    }
}
