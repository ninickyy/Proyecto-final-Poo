package Prueba;
import modelo.Persona;
import modelo.Candidato;
import Metodos.MetodoCandidato;
import java.util.Scanner;
public class PruebaCandidato {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese sus nombres: ");
            String nombres = sc.next(); 
            System.out.println("Ingrese sus apellidos: ");
            String apellidos = sc.next();
            System.out.println("Ingrese su DNI: ");
            String dni = sc.next();
            System.out.println("Ingrese su partido político: ");
            String partidoPolitico = sc.next(); 
            System.out.println("Ingreso correcto del candidato !");
            
            //Crear objeto candidato
            Candidato c1 = new Candidato(nombres,apellidos,dni,partidoPolitico);
            MetodoCandidato post1 = new MetodoCandidato();
            post1.registrarCandidato(c1);
            post1.mostrarCandidato();
            
            //Modificar candidato
            Candidato c2 = new Candidato(nombres,apellidos,dni,partidoPolitico);
            MetodoCandidato post2 = new MetodoCandidato();
            post2.modificarCandidato(c2, dni, apellidos);
            
            //Eliminar candidato
            Candidato c3 = new Candidato(nombres,apellidos,dni,partidoPolitico);
            MetodoCandidato post3 = new MetodoCandidato();
            post3.eliminarCandidato(c3, dni);
    }
}
