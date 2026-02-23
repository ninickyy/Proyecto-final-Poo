package Metodos;
import Modelo.Eleccion;
import Modelo.Candidato;

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
        if (total < elecciones.length) {
            Eleccion e = new Eleccion(fecha, tipo, candidatos);
            elecciones[total] = e;
            total++;
        } else {
            System.out.println("No hay espacio para registrar mas elecciones");
        }
    }
    //Modificacion de eleccion
    public void modificarEleccion(int posicion, String nuevaFecha, String nuevoTipo) {
        if (posicion >= 0 && posicion < total) {
            elecciones[posicion].setFecha(nuevaFecha);
            elecciones[posicion].setTipo(nuevoTipo);
        }
    }
    
    //Eliminar eleccion
    public void eliminarEleccion(int pos) {
        if (pos >= 0 && pos < total) {
            for (int i = pos; i < total - 1; i++) {
                elecciones[i] = elecciones[i + 1];
            }
            elecciones[total - 1] = null;
            total--;
        }
    
    }
 }
