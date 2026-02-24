package modelo;
import modelo.*;
public class Voto {
    protected String tipo;
    protected int codigo;
    protected Candidato candidato;
    protected boolean preferencial;
    protected String fecha;
    
    //Constructor
    //Default
    public Voto() {
        tipo = "";
        codigo = 0;
        candidato = new Candidato();
        preferencial = true;
        fecha = "";
    }
    //Con parámetros
    public Voto(String tipo, int codigo, Candidato candidato, boolean preferencial, String fecha) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.candidato = candidato;
        this.preferencial = preferencial;
        this.fecha = fecha;
    }
    
    //Getter and setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    //Métodos
    
    
    
    //Ver info
    public String verInfo() {
        return "Voto:" + "Tipo: " + tipo + "\nCodigo: " + codigo + "\nCandidato: " + candidato + 
                "\nPreferencial: " + preferencial + "\nFecha: " + fecha;
    }
     
}

