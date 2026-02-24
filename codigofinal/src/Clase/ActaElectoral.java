package modelo;
import modelo.*;
import modelo.Voto;
public class ActaElectoral {
    //Atributos 
    private int numeroActa;
    private String titulo;
    private String fecha;
    private Voto[] votos;
    private final static int MAX= 100;
    private int votosPreferencial;
    private int totalVotos;
    private String observaciones;
    private String firma;
    private String selloOficial; 
    
    //Constructores
    //Default
    public ActaElectoral() {
        super();
        numeroActa = 0;
        titulo = "";
        fecha = "";
        votos = new Voto[MAX];
        votosPreferencial = 0;
        totalVotos = 0;
        observaciones = "";
        firma = "";
        selloOficial = ""; 
    }
    //Con parámetros

    public ActaElectoral(int numeroActa, String titulo, String fecha, Voto[] votos, int votosPreferencial, int totalVotos, 
            String observaciones, String firma, String selloOficial) {
        this.numeroActa = numeroActa;
        this.titulo = titulo;
        this.fecha = fecha;
        this.votos = votos;
        this.votosPreferencial = votosPreferencial;
        this.totalVotos = totalVotos;
        this.observaciones = observaciones;
        this.firma = firma;
        this.selloOficial = selloOficial;
    }


    //Getter and setter 
    public int getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(int numeroActa) {
        this.numeroActa = numeroActa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public Voto[] getVotos() {
        return votos;
    }

    public void setVotos(Voto[] votos) {
        this.votos = votos;
    }

    public int getVotosPreferencial() {
        return votosPreferencial;
    }

    public void setVotosPreferencial(int votosPreferencial) {
        this.votosPreferencial = votosPreferencial;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(int totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getSelloOficial() {
        return selloOficial;
    }

    public void setSelloOficial(String selloOficial) {
        this.selloOficial = selloOficial;
    }
    
    //Métodos
    public void agregarVoto(Voto v){
        //cuenta la cantidad de votos
        if(totalVotos < votos.length){
            //si totalVotos es menor a la cantidad en el arreglo, se suma a este
            votos[totalVotos] = v;
            totalVotos++;
            //si es mayor, el sistema ya no permite ingresar más
        }else{
            System.out.println("No se pueden registrar más votos,"
                    + " limite alcanzado");
        }
    }
    
    public void modificarVoto(int codigo,Voto v){
        for (int i = 0; i < totalVotos; i++) {
            if(votos[i].getCodigo() == codigo){
                votos[i] = v;
            }
            else{
                System.out.println("No se pudo modificar el voto");
            }
        }
    }
    
    public int contarVotos(){
        //Solo devuelve los votos totales registrados en el programa
        return totalVotos;
    }
    
    public int contarVotosTipo(String tipo){
        int votoBlanco = 0;
        int votoNulo = 0;
        int votoValido = 0;
        if (tipo.equals("Blanco") || tipo.equals("blanco")) {
            votoBlanco++;
        }else if(tipo.equals("Nulo") || tipo.equals("nulo")){
            votoNulo++;
        }else if (tipo.equals("Valido") || tipo.equals("valido")){
            votoValido++;
        }
        return totalVotos;
    }
    
    public int contarVotosPorCandidato (Candidato c){
        //Se establece el contador
        int contador = 0;
        //Se procede con la condición si es menor que el total de votos
        for (int i = 0; i < totalVotos; i++) {
            //Los votos actuales del arreglo se guardan en v como una más fácil
            //de acceder a la información almacenada
            Voto v = votos[i];
            //si el voto es igual a blanco o nulo, no se agrega 
            if(v.tipo.equals("Blanco")||v.tipo.equals("blanco")
                    ||v.tipo.equals("Nulo")||v.tipo.equals("nulo")){
            }else{
            //se verifica si coinciden los nombres y apellidos con el candidato seleccionado
                if(votos[i].candidato.getNombres().equals(c.getNombres()) && 
                        (votos[i].candidato.getApellidos().equals(c.getApellidos()))){
                    //si cumple, se le agrega un voto al candidato mediante el contador
                    contador = contador + 1;
                }
            }
        }
        return contador;
    }
    
    public int contarVotosPreferenciales (String tipo){
        int contador = 0;
        for (int i = 0; i < totalVotos; i++) {
        //Se procede con la condición si es menor que el total de votos
            if (tipo.equals(votosPreferencial)){
        //si el voto es igual a preferencial, se agrega mediante el contador
            contador++;
            }
        }
        return contador;
    }
    
    public void calcularResultado(){
        int votoValido = contarVotosTipo("Valido");
        int votoBlanco = contarVotosTipo("Blanco");
        int votoNulo = contarVotosTipo("Nulo");
        System.out.println("Votos válidos: " + votoValido);
        System.out.println("Votos en blanco: " + votoBlanco);
        System.out.println("Votos nulos: " + votoNulo);
    }

    
    public String verInfo() {
        return "ActaElectora: " + "Numero de acta: " + numeroActa +
                "\nTitulo: " + titulo + 
                "\nFecha: " + fecha + 
                "\nVotos: " + votos + 
                "\nVotos Preferencial: " + votosPreferencial + 
                "\nTotal de votos: " + totalVotos + 
                "\nObservaciones: " + observaciones + 
                "\nFirma: " + firma + 
                "\nSello oficial: " + selloOficial;
         
    }
     
}



