package Habitats;

public class HabitatTerrestre extends Habitasts{

    boolean puede_caminar;

    public HabitatTerrestre(float temperatura, float humedad, boolean limpieza, boolean puede_caminar){
        super(temperatura, humedad, limpieza);
        this.puede_caminar = puede_caminar;
    }

    public boolean puedeCaminar(){
        return puede_caminar;
    }

    public void setPuedeCaminar(boolean puede_caminar){
        this.puede_caminar = puede_caminar;
    }

    public String toString(){
        return "terrestres";
    }

    public boolean getPuedeCaminar(){
        return puede_caminar;
    }

    public void setPuedeCaminar(boolean puede_caminar){
        this.puede_caminar = puede_caminar;
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