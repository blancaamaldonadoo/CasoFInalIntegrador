package ZOOLOGICO.Animales;

public class Animal_Aviario extends Animales{
    boolean vuela;
    boolean pico;
    boolean plumaje;
    String tipo_aviario;

    public Animal_Aviario(String nombre, String especie, int id, boolean salud, boolean comportamiento, boolean alimentacion, boolean vuela, boolean pico, boolean plumaje, String tipo_aviario){
        super(nombre, especie, id, salud, comportamiento, alimentacion);
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
        this.tipo_aviario = tipo_aviario;
    }

    //GETTERS Y SETTERS:

    public boolean getVuela(){
        return vuela;
    }

    public boolean getPico(){
        return pico;
    }

    public boolean getPlumaje(){
        return plumaje;
    }

    public String getTipo_Aviario(){
        return tipo_aviario;
    }

    public void setVuela(boolean vuela){
        this.vuela = vuela;
    }

    public void setPico(boolean pico){
        this.pico = pico;
    }

    public void setPlumaje(boolean plumaje){
        this.plumaje = plumaje;
    }

    public void setTipo_Aviario(String tipo_aviario){
        this.tipo_aviario = tipo_aviario;
    }

    @Override
    public String toString(){
        String texto="";
        texto+= super.toString();
        texto+="Vuela: "+vuela+"\n";
        texto+="Pico: "+pico+"\n";
        texto+="Plumaje: "+plumaje+"\n";
        texto+="Tipo Aviario: "+tipo_aviario+"\n";
        return texto;
    }

}