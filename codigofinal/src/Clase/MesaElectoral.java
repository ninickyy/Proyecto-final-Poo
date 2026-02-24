package modelo;
public class MesaElectoral {
    //Atributos
    private String codigoMesa;
    private String lugar; 
    private MiembroDeMesa[] miembros;
    private int nroVotantesRegistrados;
    private int nroVotantesEfectivos;
    
    //Constructores
    public MesaElectoral() {
        codigoMesa = "";
        lugar = "";
        miembros = new MiembroDeMesa[3];
        nroVotantesRegistrados = 0;
        nroVotantesEfectivos =0;
    }

    public MesaElectoral(String codigoMesa, String lugar, MiembroDeMesa[] miembros, int nroVotantesRegistrados, int nroVotantesEfectivos) {
        this.codigoMesa = codigoMesa;
        this.lugar = lugar;
        this.miembros = miembros;
        this.nroVotantesRegistrados = nroVotantesRegistrados;
        this.nroVotantesEfectivos = nroVotantesEfectivos;
    }
    //Getters and Setters
    public String getCodigoMesa() {
        return codigoMesa;
    }

    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public MiembroDeMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroDeMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getNroVotantesRegistrados() {
        return nroVotantesRegistrados;
    }

    public void setNroVotantesRegistrados(int nroVotantesRegistrados) {
        this.nroVotantesRegistrados = nroVotantesRegistrados;
    }

    public int getNroVotantesEfectivos() {
        return nroVotantesEfectivos;
    }

    public void setNroVotantesEfectivos(int nroVotantesEfectivos) {
        this.nroVotantesEfectivos = nroVotantesEfectivos;
    }
   public String verInfo(){
    return "\nEl codigo de la mesa es: " +codigoMesa+
           "\nEl lugar de votación es: " +lugar+
           "\nEl total de votantes registrados es: " +nroVotantesRegistrados+
           "\nEl total de votantes efectivos es: " +nroVotantesEfectivos;
    }
   
}

