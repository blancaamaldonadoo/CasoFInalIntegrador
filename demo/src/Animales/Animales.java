
package Animales;

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

    public void buenaSalud(boolean salud){
        if(salud == true){
            System.out.println("El animal " + nombre + "se encuentra en buen estado de salud");
            else System.out.println("El animal " + nombre + "se encuentra en mal estado de salud");
    }

    public void buenComportamiento(boolean comportamiento){
        if(comportamiento == true){
            System.out.println("El animal " + nombre + "se encuentra en buen estado de comportamiento");
            else System.out.println("El animal " + nombre + "se encuentra en mal estado de comportamiento");
    }

    //método para registrar el nombre
    public void registrarNombre(String nombre){
        System.out.println("El nombre del animal es: " + nombre);
    }

    //método para regustrar la alimentacion

    public void registrarAlimentacion(String alimentacion){
        System.out.println("El animal " + nombre + " se alimenta de: " + alimentacion);
    }

    public void registrarComportamiento(boolean comportamiento){
        System.out.println("El animal " + nombre + " tiene un comportamiento: " + buenComportamiento(comportamiento));
    }

    public void registrarSalud(boolean salud){
        System.out.println("El animal " + nombre + " tiene un estado de salud: " + buenaSalud(salud));
    }

}