
package ZOOLOGICO.Animales;

public class Animales{
    String nombre;
    String especie;
    int id;
    boolean salud;
    boolean comportamiento;
    boolean alimentacion;

    public Animales(String nombre, String especie, int id, boolean salud, boolean comportamiento, boolean alimentacion){
        this.nombre = nombre;
        this.especie = especie;
        this.id = id;
        this.salud = salud;
        this.comportamiento = comportamiento;
        this.alimentacion = alimentacion;
    }

    //GETTERS Y SETTERS:

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEspecie(){
        return especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public boolean getSalud(){
        return salud;
    }

    public void setSalud(boolean salud){
        this.salud = salud;
    }

    public boolean getComportamiento(){
        return comportamiento;
    }

    public void setComportamiento(boolean comportamiento){
        this.comportamiento = comportamiento;
    }

    public boolean getAlimentacion(){
        return alimentacion;
    }

    public void setAlimentacion(boolean alimentacion){
        this.alimentacion = alimentacion;
    }

    public String buenaSalud(boolean salud){
        if(salud == true){
            return "El animal " + nombre + "se encuentra en buen estado de salud";
        }
        else return "El animal " + nombre + "se encuentra en mal estado de salud";
    }

    public String buenComportamiento(boolean comportamiento){
        if(comportamiento == true){
            return "El animal " + nombre + "se encuentra en buen estado de comportamiento";
        }
        else return "El animal " + nombre + "se encuentra en mal estado de comportamiento";
    }
    
    public String toString(){
        String texto= "";
        texto+= "Nombre: " + nombre + "\n";
        texto+= "Especie: " + especie + "\n";
        texto+= "ID: " + id + "\n";
        texto+= "Salud: " + buenaSalud(getSalud()) + "\n";
        texto+= "Comportamiento: " + buenComportamiento(getComportamiento()) + "\n";
        texto+= "Alimentacion: " + alimentacion + "\n";
        return texto;
    }

}
