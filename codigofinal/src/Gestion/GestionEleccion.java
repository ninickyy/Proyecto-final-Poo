package metodos;
import modelo.Eleccion;
import modelo.Candidato;

public class GestionEleccion {
    
    //Atributos
    private Eleccion[] elecciones;
    private int total;
    
    //Constructores
    public GestionEleccion() {
        elecciones = new Eleccion[10];
        total = 0;
    }

    public GestionEleccion(Eleccion[] elecciones, int total) {
        this.elecciones = elecciones;
        this.total = total;
    }
    //Getters and Setters
    public Eleccion[] getElecciones() {
        return elecciones;
    }

    public void setElecciones(Eleccion[] elecciones) {
        this.elecciones = elecciones;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    //Registrar eleccion
    public void registrarEleccion(String fecha, String tipo, Candidato[] candidatos) {
        //se verifica que aun haya espacio en el arreglo
        if (total < elecciones.length) {
            Eleccion e = new Eleccion(fecha, tipo, candidatos); //crea nueva eleccion
            elecciones[total] = e; //guarda la eleccion 
            total++;
        } else {
            System.out.println("No hay espacio para registrar mas elecciones");
        }
    }
    //Modificacion de eleccion
    public void modificarEleccion(String fecha, String tipo) {

    for (int i = 0; i < total; i++) {
        //se busca la eleccion por su fecha
        if (elecciones[i].getFecha().equals(fecha)) {
            //se actualiza los datos
            elecciones[i].setFecha(fecha);
            elecciones[i].setTipo(tipo);
            System.out.println("Elección modificada");
            return;
        }
    }
    System.out.println("Elección no encontrada");
    }    
   
    //Eliminar eleccion
    public void eliminarEleccion(String fecha, String tipo) {

    for (int i = 0; i < total; i++) {
        //se compara fecha y tipo
        if (elecciones[i].getFecha().equals(fecha)
            && elecciones[i].getTipo().equals(tipo)) {
            //retrocede una posicion atras
            for (int j = i; j < total - 1; j++) {
                elecciones[j] = elecciones[j + 1];
            }
            //ultima posicion eliminada
            elecciones[total - 1] = null;
            total--;
            return;
            }
        }
    }
    public String generarInforme() {
    String mensaje = "Elecciones:\n\n";
    for (int i = 0; i < total; i++) {
        mensaje += "Fecha: " + elecciones[i].getFecha()
                +  "\nTipo: " + elecciones[i].getTipo()+ 
                "\n\n";
    }
    return mensaje;
    }
}


