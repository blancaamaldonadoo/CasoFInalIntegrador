package Habitats;

public class Habitat{

    float temperatura;
    float humedad;
    boolean limpieza;

    public Habitat(float temperatura, float humedad, boolean limpieza){
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public void setTemperatura(float temperatura){
        this.temperatura = temperatura;
    }

    public float getTemperatura(){
        return temperatura;
    }

    public void setHumedad(float humedad){
        this.humedad = humedad;
    }

    public float getHumedad(){
        return humedad;
    }

    public boolean estaLimpio(){
        return limpieza;
    }

    public void setLimpieza(boolean limpieza){
        this.limpieza = limpieza;
    }

    @Override
    public String toString(){
        return "Temperatura" ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    

}