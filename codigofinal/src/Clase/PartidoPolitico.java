package modelo;
public class PartidoPolitico {
  //Atributos
    private String nombrePartido;
    private String sigla;
    private String logo;
    private String representanteLegal;

    //Consturctor con parametros

    public PartidoPolitico(String nombrePartido,String sigla,String logo,String representanteLegal){
        this.nombrePartido = nombrePartido;
        this.sigla = sigla;
        this.logo = logo;
        this.representanteLegal = representanteLegal;
    }

    //Getters y setters
    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    //Metodo

    public String verInfo(){
        return "El nombre del partido es: "+nombrePartido +
        "\n La sigla es: "+sigla+
        "\n El logo es: "+ logo+
        "\n El representante legal es: "+representanteLegal;
    }

}


