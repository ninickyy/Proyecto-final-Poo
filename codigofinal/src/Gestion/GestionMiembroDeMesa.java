package metodos;
import modelo.MiembroDeMesa;
public class GestionMiembroDeMesa {

    //Atributos
    private MiembroDeMesa[] miembros;
    private int totalMiembros;

    //Constructores
    public GestionMiembroDeMesa() {
        miembros = new MiembroDeMesa[10];
        totalMiembros = 0;
    }
    
    public GestionMiembroDeMesa(MiembroDeMesa[] miembros, int totalMiembros) {
        this.miembros = miembros;
        this.totalMiembros = totalMiembros;
    }
    
    //Getters and Setters

    public MiembroDeMesa[] getMiembros() {
        return miembros;
    }

    public void setMiembros(MiembroDeMesa[] miembros) {
        this.miembros = miembros;
    }

    public int getTotalMiembros() {
        return totalMiembros;
    }

    public void setTotalMiembros(int totalMiembros) {
        this.totalMiembros = totalMiembros;
    }

    //Registrar miembro
    public void registrar(MiembroDeMesa m) {
        if (totalMiembros < miembros.length) {
            miembros[totalMiembros] = m;
            totalMiembros++;
        } else {
            System.out.println("No hay espacio para más miembros.");
        }
    }

    //Modificar miembro
    public void modificar(int posicion, MiembroDeMesa nuevoMiembro) {
        if (posicion >= 0 && posicion < totalMiembros) {
            miembros[posicion] = nuevoMiembro;
        }
    }

    //Eliminar miembro
    public void eliminar(int posicion) {
        if (posicion >= 0 && posicion < totalMiembros) {
            for (int i = posicion; i < totalMiembros - 1; i++) {
                miembros[i] = miembros[i + 1];
            }
            miembros[totalMiembros - 1] = null;
            totalMiembros--;
        }
    }

    //Generar informe
    public String generarInforme() {
        String informe = "===INFORME DE MIEMBROS DE MESA===\n";

        for (int i = 0; i < totalMiembros; i++) {
            informe += "Posición " + i + ": ";
            informe += "Tipo: " + miembros[i].getTipo() + "\n";
        }

        informe += "Total de miembros registrados: " + totalMiembros;

        return informe;
    }

}
