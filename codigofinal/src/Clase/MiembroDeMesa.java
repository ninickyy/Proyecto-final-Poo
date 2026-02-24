package modelo;
public class MiembroDeMesa extends Persona {
    //Atributos
    private String tipo;
    
    //Constructor
    public MiembroDeMesa() {
        super();
        tipo = "";
    }

    public MiembroDeMesa(String nombres, String apellidos, String tipo) {
        super(nombres, apellidos);
        this.tipo = tipo;
    }
    
    //Getters and Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String verInfo(){
    return "\nNombre: " +super.getNombres()+
           "\nApellidos: " +super.getApellidos()+
           "\nTipo de miembro: " +tipo;
    }
}
