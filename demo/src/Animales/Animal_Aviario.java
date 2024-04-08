package Animales;

public class Animal_Aviario{
    boolean vuela;
    boolean pico;
    boolean plumaje;
    String tipo_aviario;

    public Animal_Aviario(boolean vuela, boolean pico, boolean plumaje, String tipo_aviario, String nombre, String especie, int id, boolean salud, boolean comportamiento, boolean alimentacion){
        super(nombre, especie, id, salud, comportamiento, alimentacion);
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
        this.tipo_aviario = tipo_aviario;
    }
}