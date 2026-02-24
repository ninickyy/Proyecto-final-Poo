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
        miembros[totalMiembros] = m;
        totalMiembros++;
    }

    //Modificar miembro
    public void modificarMiembro(String nombres, String apellidos, String nuevoTipo){
    for(int i = 0; i < totalMiembros; i++){
        //se busca a el miembro por nombres y apellidos
        if(miembros[i].getNombres().equals(nombres) &&
           miembros[i].getApellidos().equals(apellidos)){
            //se actualiza el tipo del miembro
            miembros[i].setTipo(nuevoTipo);
            System.out.println("Se modifico el miembro");
            return;
        }
    }
    System.out.println("Miembro no modificado");
}

    //Eliminar miembro
    public void eliminarMiembro(String nombres, String apellidos){
    for(int i = 0; i < totalMiembros; i++){
        //se localiza al miembro por nombres y apellidos
        if(miembros[i].getNombres().equals(nombres) &&
           miembros[i].getApellidos().equals(apellidos)){
            //se reemplaza por el ultimo miembro
            miembros[i] = miembros[totalMiembros - 1];
            totalMiembros--;
            System.out.println("Se elimino el miembro");
            return;
        }
    }
    System.out.println("Miembro no eliminado");
}

    //Generar informe
    public String generarInforme(){

    String informe = "\nMiembros de Mesa:\n";

    for(int i = 0; i < totalMiembros; i++){
        informe += miembros[i].verInfo() + "\n";
    }

    return informe;
}

}
