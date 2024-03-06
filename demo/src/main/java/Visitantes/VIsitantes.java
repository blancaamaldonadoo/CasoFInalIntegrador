package visitantes;

public class Visitantes{

    String nombre;
    String apellido;
    int id;
    String tipoVisitante;

    public Visitantes(String nombre, String apellido, int id, String tipoVisitante){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.tipoVisitante = tipoVisitante;
    }

    //GETTERS Y SETTERS:

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTipoVisitante(){
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante){
        this.tipoVisitante = tipoVisitante;
    }

}

