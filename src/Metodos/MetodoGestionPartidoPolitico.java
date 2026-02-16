public class MetodoGestionPartidoPolitico {
    //Atributos
    private partidoPolitico[] partidos;
    private int nroPartidos;

    //Constructor sin parametros
    public MetodoGestionPartidoPolitico(){
        partidos = partidoPolitico[100];
        contador = 0;
    }

    //Registrar partido

    public void registrar(PartidoPolitico partido){
        if (contador<partidos.length){
            partidos[contador] = partido;
            contador++;
        }else{
            System.out.println("No es posible agregar más partidos.");
        }
    }

    //Modificar partido

    public void modificar(int posicion, String nombrePartido, String sigla, String logo, String representanteLegal){
        //Que este dentro del rango
        if (posicion>=0&&posicion<contador){
            partidoPolitico[posicion].setNombrePartido(nombrePartido);
            partidoPolitico[posicion].setSigla(sigla);
            partidoPolitico[posicion].setLogo(logo);
            partidoPolitico[posicion].setRepresentanteLegal(representanteLegal);

        }else{
            System.out.println("Ingrese una posicion valida.");
        }
    }

    //Eliminar partido


    public void eliminar(int posicion){
        //Que este dentro del rango
        if (posicion>=0&&posicion<contador){
            for (int i = posicion; i<posicion-1;i++){
                
                partido[i]=partido[i+1];

            }
            contador--;
        }
    }

}
