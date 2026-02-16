package Metodos;
import modelo.Persona;
import modelo.Candidato;
import java.util.Scanner;
public class MetodoCandidato {
    Candidato[] candidatos = new Candidato[20];
    int contador = 0; 
    //Métodos
    //Registrar
    public void registrarCandidato(Candidato postulante) {
        candidatos[contador] = postulante;
        contador++;
        
    }
    
    //Modificar
    public void modificarCandidato(Candidato postulante, String dni, String nuevoCandidato){
        for (int i = 0; i < contador; i++) {
            if(candidatos[i].getDni().equals(dni)){
                candidatos[i].setPartidoPolitico(nuevoCandidato);
                System.out.println("Se modifico el candidato");
                return;
            }
        }System.out.println("Candidato no modificado");
    }
    
    //Eliminar
    public void eliminarCandidato(Candidato postulante, String dni){
        for (int i = 0; i < contador; i++) {
            if(candidatos[i].getDni().equals(dni)){
                candidatos[i] = candidatos[contador-1];
                contador--;
                return;
            }
        }System.out.println("Candidato no eliminado");
    }
    
    //Mostrar
    public void mostrarCandidato(){
        for (int i = 0; i < contador; i++) {
            System.out.println("Ver informacion de candidatos: " + 
                    candidatos[i].verInfo());
        }
   }
    
}
