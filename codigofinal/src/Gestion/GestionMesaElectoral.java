package metodos;
import Modelo.MesaElectoral;
import Modelo.MiembroDeMesa;
    //Atributos
    public class GestionMesaElectoral {
    private MesaElectoral[] mesas;
    private int totalMesasElectorales;

    //Constructores
    public GestionMesaElectoral() {
        mesas = new MesaElectoral[10];
        totalMesasElectorales = 0;
    }

    public GestionMesaElectoral(MesaElectoral[] mesas, int totalMesasElectorales) {
        this.mesas = mesas;
        this.totalMesasElectorales = totalMesasElectorales;
    }
    
    //Getters and Setters
    public MesaElectoral[] getMesas() {
        return mesas;
    }

    public void setMesas(MesaElectoral[] mesas) {
        this.mesas = mesas;
    }

    public int getTotalMesasElectorales() {
        return totalMesasElectorales;
    }

    public void setTotalMesasElectorales(int totalMesasElectorales) {
        this.totalMesasElectorales = totalMesasElectorales;
    }
    
    // Registrar mesa
    public void registrar(MesaElectoral m) {
        if (totalMesasElectorales < mesas.length) {
            mesas[totalMesasElectorales] = m;
            totalMesasElectorales++;
        } else {
            System.out.println("No hay espacio para más mesas.");
        }
    }

    // Modificar mesa
    public void modificar(int posicion, MesaElectoral nuevaMesa) {
        if (posicion >= 0 && posicion < totalMesasElectorales) {
            mesas[posicion] = nuevaMesa;
        }
    }

    // Eliminar mesa
    public void eliminar(int posicion) {
        if (posicion >= 0 && posicion < totalMesasElectorales) {
            for (int i = posicion; i < totalMesasElectorales - 1; i++) {
                mesas[i] = mesas[i + 1];
            }
            mesas[totalMesasElectorales - 1] = null;
            totalMesasElectorales--;
        }
    }

    // Asignar miembro a una mesa específica
    public void asignarMiembro(int posicionMesa, MiembroDeMesa miembro, int posicionMiembro) {
        if (posicionMesa >= 0 && posicionMiembro < totalMesasElectorales) {
            MesaElectoral mesa = mesas[posicionMiembro];
            MiembroDeMesa[] miembros = mesa.getMiembros();

            if (posicionMiembro >= 0 && posicionMiembro < miembros.length) {
                miembros[posicionMiembro] = miembro;
            }
        }
    }

}
