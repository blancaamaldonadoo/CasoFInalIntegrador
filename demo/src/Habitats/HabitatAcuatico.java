package Habitats;

public class HabitatAcuatico extends Habitast{

    boolean puede_nadar;

    public HabitatAcuatico(float temperatura, float humedad, boolean limpieza, boolean puede_nadar){
        super(temperatura, humedad, limpieza);
        this.puede_nadar = puede_nadar;
    }

    public boolean puedeNadar(){
        return puede_nadar;
    }

    public void setPuedeNadar(boolean puede_nadar){
        this.puede_nadar = puede_nadar;
    }

    public String toString(){
        return "acuaticos";
    }

    public boolean getPuedeNadar(){
        return puede_nadar;
    }

    public void setPuedeNadar(boolean puede_nadar){
        this.puede_nadar = puede_nadar;
    }

    public float getTemperatura(){
        return temperatura;
    }

    public void setTemperatura(float temperatura){
        this.temperatura = temperatura;
    }

    public float getHumedad(){
        return humedad;
    }

    public void setHumedad(float humedad){
        this.humedad = humedad;
    }

    public boolean estaLimpio(){
        return limpieza;
    }

    public void setLimpieza(boolean limpieza){
        this.limpieza = limpieza;
    }
}