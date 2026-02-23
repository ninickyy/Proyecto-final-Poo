package metodo;
import modelo .*;
public class GestionActaElectoral {
    private ActaElectoral[] actas = new ActaElectoral[25];
    private int totalActas = 0; 
    
    //Métodos
    public void registrarActaElectoral(ActaElectoral a){
        //en base al contador se van agregando las actas        
        actas[totalActas]=a;
        //por eso va aumentando 
        totalActas++;
    }
    
    public void modificarActaElectoral(int nroActa, String nuevoTitulo, String nuevaFecha){
        for (int i = 0; i < totalActas; i++) {
            if(actas[i].getNumeroActa() == nroActa){
                actas[i].getTitulo().equals(nuevoTitulo);
                actas[i].getFecha().equals(nuevaFecha);
                System.out.println("Se modifico el acta");
                return;
            }
        }
        System.out.println("Acta no modificada");
    }
    
    public void eliminarActaElectoral(int nroActa){
        for (int i = 0; i < totalActas; i++) {
            if(actas[i].getNumeroActa() == nroActa){
                actas[i] = actas[totalActas-1];
                totalActas--;
                System.out.println("Se elimino el acta");
                return;
            }            
        }
        System.out.println("Acta no eliminada");
    }
}

