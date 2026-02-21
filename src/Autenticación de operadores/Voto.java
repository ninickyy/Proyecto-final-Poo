package Modelo;

public class Voto {

    private String tipo;
    private boolean preferencial;
    private int total;

    public Voto(String tipo, boolean preferencial, int total) {
        this.tipo = tipo;
        this.preferencial = preferencial;
        this.total = total;
    }

    public String verInfo() {
        return "Tipo: " + tipo +
               " Preferencial: " + preferencial +
               " Total: " + total;
    }
}
