package metodos;
import modelo;
public class MetodoGestionPartidoPolitico {
    //Atributos
    private PartidoPolitico[] partidos;
    private int nroPartidos;

    //Constructor sin parametros
    public MetodoGestionPartidoPolitico(){
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

    public void modificar(int posicion, String nombrePartido, String sigla, String logo, String representanteLegal){
        //Que este dentro del rango
        if (posicion>=0&&posicion<nroPartidos){
            partidos[posicion].setNombrePartido(nombrePartido);
            partidos[posicion].setSigla(sigla);
            partidos[posicion].setLogo(logo);
            partidos[posicion].setRepresentanteLegal(representanteLegal);

        }else{
            System.out.println("Ingrese una posicion valida.");
        }
    }

    //Eliminar partido


    public void eliminar(int posicion){
        //Que este dentro del rango
        if (posicion>=0&&posicion<nroPartidos){
            for (int i = posicion; i<nroPartidos-1;i++){
                
                partidos[i]=partidos[i+1];

            }
            nroPartidos--;
        }
    }

}





