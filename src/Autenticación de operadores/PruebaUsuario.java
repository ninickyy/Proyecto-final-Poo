package Metodos;
import java.util.Scanner;
import modelo.Usuario;
public class PruebaUsuario {
    public static void main (String [] args){
        Usuario user1 = new Usuario();
        System.out.println("Información del usuario: ");
        user1.leer();
        System.out.println("Gracias por registrar sus datos");
    }
}
