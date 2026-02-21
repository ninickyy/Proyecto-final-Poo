package modelo;

public class Usuario extends Persona {

    private String usuario;
    private String clave;

    public Usuario(String nombres, String apellidos, String usuario, String clave) {
        super(nombres, apellidos);
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean Autenticacion() {
        return true;
    }

    @Override
    public String verInfo() {
        return "Usuario: " + nombres + " " + apellidos;
    }
}
