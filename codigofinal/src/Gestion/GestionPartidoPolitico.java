package metodos;
import modelo.*;
public class GestionPartidoPolitico {
    //Atributos
    private PartidoPolitico[] partidos;
    private int nroPartidos;

    //Constructor sin parametros
    public GestionPartidoPolitico(){
        partidos = new PartidoPolitico[100];
        nroPartidos = 0;
    }

    //Registrar partido

    public void registrar(PartidoPolitico partido){
        if (nroPartidos<partidos.length){
            partidos[nroPartidos] = partido;
            nroPartidos++;
        }else{
            System.out.println("No es posible agregar más partidos.");
        }
    }

    //Modificar partido


        
    public void modificar(String nombrePartido, String sigla, String logo, String representanteLegal){
        for (int i = 0; i < nroPartidos; i++) {
            //se obtienen los datos del candidato viendo si su dni es igual al que se busca
            if(nombrePartido.equals(partidos[i].getNombrePartido())){
                partidos[i].setSigla(sigla);
                partidos[i].setLogo(logo);
                partidos[i].setRepresentanteLegal(representanteLegal);
                System.out.println("Se modifico el partido");
                return;
            }
        }
        System.out.println("Partido no modificado");
    }

    //Eliminar partido



        public void eliminar(String nombrePartido, String sigla, String logo, String representanteLegal){
        for (int i = 0; i < nroPartidos; i++) {
            //se localiza al partido por su dni
            if(partidos[i].getNombrePartido().equals(nombrePartido)){
                //al encontrarlo en la lista, se elimina 1 en el contador
                partidos[i] = partidos[nroPartidos-1];
                //por eso se disminuye
                nroPartidos--;
                System.out.println("Se elimino el partido");
                return;
            }
        }System.out.println("Partido no eliminado");
    }
        
    public String generarInforme() {
    String informe = "\nPartidos politicos:\n";

    for (int i = 0; i < nroPartidos; i++) {
        informe += partidos[i].verInfo() + "\n";
        
    }

    return informe;
}

}