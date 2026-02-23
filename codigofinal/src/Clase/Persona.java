package modelo;
public class Persona {
    //Atributos
    protected String nombres;
    protected String apellidos;
    
    //Constructores
    //Default
    public Persona() {
        nombres = "";
        apellidos = "";
    }
    //Con parámetros
    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    //Getter and setter
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    //Método para visualizar
    public String verInfo() {
        return "Nombres: " + nombres + "\nApellidos: " + apellidos;
    }
      
}
