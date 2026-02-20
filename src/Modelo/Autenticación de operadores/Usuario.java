package modelo;
import java.util.Scanner;
public class Usuario {
    private String usuario;
    private String clave;
    
    //Constructor
    //Default
    public Usuario() {
        usuario = "";
        clave = "";
    }

    //Getter and setter
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
    
    //Métodos
    public boolean autenticacion(String usuarioIngresado, String contraseña){
        if(usuarioIngresado.equals(usuario) && 
                contraseña.equals(clave)){
            return true;
        }else{
            return false;
        }
    }
    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        usuario = sc.next();
        System.out.println("Ingrese su contrasenia: ");
        clave = sc.next();
    }
    
    public String verInfo(){
        return usuario + clave; 
    }
}
