package modelo;

public class Usuario {

    private String usuario;
    private String clave;

    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean Autenticacion(String user, String pass) {
        if (this.usuario.equals(user) && this.clave.equals(pass)) {
            return true;
        }
        return false;
    }
}
