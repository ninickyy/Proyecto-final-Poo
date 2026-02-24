package metodos;
import modelo.MesaElectoral;
import modelo.MiembroDeMesa;
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
        //verificar espacio
        if (totalMesasElectorales < mesas.length) {
            mesas[totalMesasElectorales] = m;
            totalMesasElectorales++;
        } else {
            System.out.println("No hay espacio para más mesas.");
        }
    }

    // Modificar mesa
    public void modificarMesa(String codigo, String Lugar,int Registrados, int Efectivos) {

    for (int i = 0; i < totalMesasElectorales; i++) {
        //se accede a modificar mediante el codigo de mesa
        if (mesas[i].getCodigoMesa().equals(codigo)) {
            //actualizacion de datos
            mesas[i].setLugar(Lugar);
            mesas[i].setNroVotantesRegistrados(Registrados);
            mesas[i].setNroVotantesEfectivos(Efectivos);

            System.out.println("Mesa modificada");
            return;
        }
    }

    System.out.println("Mesa no encontrada");
    }

    // Eliminar mesa
    public void eliminarMesa(String codigo){

    for(int i = 0; i < totalMesasElectorales; i++){
        //se accede mediante el codigo para eliminar
        if(mesas[i].getCodigoMesa().equals(codigo)){
            //disminuye el total de mesas
            mesas[i] = mesas[totalMesasElectorales - 1];
            totalMesasElectorales--;//disminuye el contador
            System.out.println("Se elimino la mesa");
            return;
        }
    }
        System.out.println("Mesa no eliminada");
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
    public String generarInforme() {
    String informe = "\nMesa Electoral:\n";

    for (int i = 0; i < totalMesasElectorales; i++) {
        informe += mesas[i].verInfo() + "\n";
    }

    return informe;
    }

}

