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
            System.out.println("No es posible agregar más partidos.")
        }
    }

    //Modificar partido

    public void modificar(int posicion, String nombrePartido, String sigla, String logo, String representanteLegal){
        //Que este dentro del rango
        if (posicion)
    }

}
