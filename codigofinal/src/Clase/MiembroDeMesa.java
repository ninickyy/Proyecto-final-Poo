package Modelo;
public class MiembroDeMesa {
    //Atributos
    private String tipo;
    
    //Constructor
    public MiembroDeMesa() {
        tipo = "";
    }

    public MiembroDeMesa(String tipo) {
        this.tipo = tipo;
    }
    //Getters and Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void verInfo(){
        System.out.println("tipo de Miembro: "+tipo);
    }

}
