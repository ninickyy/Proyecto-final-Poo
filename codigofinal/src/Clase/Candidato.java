package modelo;
public class Candidato extends Persona {
    private String dni;
    private String partidoPolitico;
    
    //Constructor
    //Default
    public Candidato() {
        super();
        dni = "";
        partidoPolitico = "";
    }
    //Con parámetros
    public Candidato(String nombres, String apellidos, String dni, String partidoPolitico) {
        super (nombres , apellidos);
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
    }
    
    //Getter and setter
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    //Método para visualizar
    @Override
    public String verInfo(){
        return "Nombres: " + nombres +
                "\nApellidos: " + apellidos +
                "\nDni : " + dni + "\nPartido politico: " + partidoPolitico;
    }
    
}
