package modelo;

public class Candidatos extends Persona {

    private String dni;
    private String partidoPolitico;

    public Candidatos(String nombres, String apellidos, String dni, String partidoPolitico) {
        super(nombres, apellidos);
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String verInfo() {
        return "Candidato: " + nombres + " " + apellidos + " DNI: " + dni;
    }
}
