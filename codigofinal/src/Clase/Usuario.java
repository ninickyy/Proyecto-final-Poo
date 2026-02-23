package modelo;

public class Usuario {

    private String usuario;
    private String clave;

    public Usuario() {
        this.usuario = "";
        this.clave = "";
    }

    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean IniciarSesion(String user, String pass) {

        boolean usuarioCorrecto = this.usuario.equals(user);
        boolean claveCorrecta = this.clave.equals(pass);

        if (usuarioCorrecto && claveCorrecta) {
            return true;
        }

        return false;
    }

}
