package ZOOLOGICO.Habitats;

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

    public String estaLimpio(){
        if(limpieza) return "está limpio";
        else return "está sucio";
    }

    public void setLimpieza(boolean limpieza){
        this.limpieza = limpieza;
    }

    @Override
    public String toString(){
        String texto="Habitat: ";
        texto+= "limpieza: "+estaLimpio() + " \n";
        texto+= "Temperatura: "+temperatura+"\n Humedad: "+humedad ;
        return texto;
    }

    

}