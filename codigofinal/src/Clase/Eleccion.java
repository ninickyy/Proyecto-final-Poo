package modelo;
public class Eleccion {
    //Atributos
    private String fecha;
    private String tipo;
    private Candidato[] candidatos;
    //Constructores
    public Eleccion() {
        fecha = "";
        tipo = "";
        candidatos = null;
    }
    public Eleccion(String fecha, String tipo, Candidato[] candidatos) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.candidatos = candidatos;
    }
    //Getters and Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Candidato[] getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
    }
    public void verInfo(){
        System.out.println("Fecha de eleccion: "+fecha);
        System.out.println("tipo de eleccion: "+tipo);
        System.out.println("Candidatos: "+candidatos);
    }

}
