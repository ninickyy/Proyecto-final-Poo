package Modelo;

public class Candidatos {

    private String dni;
    private String partidoPolitico;

    public Candidatos(String dni, String partidoPolitico) {
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
    }

    public String verInfo() {
        return "DNI: " + dni + " - Partido: " + partidoPolitico;
    }
}}
}
