package metodos;
import modelo .*;
public class GestionCandidato {
    private Candidato[] candidatos = new Candidato[20];
    private int contador = 0; 
    //Métodos
    //Registrar candidato
    public void registrarCandidato(Candidato postulante) {
        //en base al contador se va agregando candidatos
        candidatos[contador] = postulante;
        //por eso se aumenta
        contador++;
        
    }
    
    //Modificar candidato
    public void modificarCandidato(Candidato postulante, String dni, String nuevoCandidato){
        for (int i = 0; i < contador; i++) {
            //se obtienen los datos del candidato viendo si su dni es igual al que se busca
            if(dni.equals(candidatos[i].getDni())){
                candidatos[i].setPartidoPolitico(nuevoCandidato);
                System.out.println("Se modifico el candidato");
                return;
            }
        }
        System.out.println("Candidato no modificado");
    }
    
    //Eliminar candidato
    public void eliminarCandidato(Candidato postulante, String dni){
        for (int i = 0; i < contador; i++) {
            //se localiza al candidato por su dni
            if(candidatos[i].getDni().equals(dni)){
                //al encontrarlo en la lista, se elimina 1 en el contador
                candidatos[i] = candidatos[contador-1];
                //por eso se disminuye
                contador--;
                System.out.println("Se elimino el candidato");
                return;
            }
        }System.out.println("Candidato no eliminado");
    }
    
    //Mostrar
    public String generarInforme(){
        String informe = "Ver datos de este candidato";
       //se pone un bucle for para contabilizar mientras sea menor que contador
        for (int i = 0; i < contador; i++) {
            //se referencia al método ver info() de la clase Candidato
            System.out.println(candidatos[i].verInfo());
        }
        return informe;
      }
 }      



