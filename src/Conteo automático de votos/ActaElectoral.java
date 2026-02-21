package modelo;

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

    public ActaElectoral(int numeroActa, String titulo, String fecha, String hora,
                         String observaciones, String firma, String selloOficial) {
        this.numeroActa = numeroActa;
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.votosEmitidos = 0;
        this.votosPreferenciales = 0;
        this.votosBlanco = 0;
        this.votosNulos = 0;
        this.observaciones = observaciones;
        this.firma = firma;
        this.selloOficial = selloOficial;
    }

    // Método 1 del UML
    public void AgregarVoto(Voto v) {

        votosEmitidos++;

        if (v.getTipo().equals("BLANCO")) {
            votosBlanco++;
        } else if (v.getTipo().equals("NULO")) {
            votosNulos++;
        } else {
            if (v.isPreferencial()) {
                votosPreferenciales++;
            }
        }
    }

    // Método 2 del UML
    public int ContarVotos() {
        return votosEmitidos;
    }
}
