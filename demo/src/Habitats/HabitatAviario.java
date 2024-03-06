package Habitats;

public class HabitatAviario extends Habitats.Habitat{

    boolean puede_volar;

    public HabitatAviario(float temperatura, float humedad, boolean limpieza, boolean puede_volar){
        super(temperatura, humedad, limpieza);
        this.puede_volar = puede_volar;
    }

    public String toString(){ //Para que nos devuelva el array de objetos que tiene el aviario
        return "aviarios";
    }

    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals (Object obj){

        return super.equals(obj);
    }

    protected void finalize () throws Throwable {
        super.finalize();
    }

    public void setPuedeVolar(boolean puede_volar){
        this.puede_volar = puede_volar;
    }

    public boolean getPuedeVolar(){
        return puede_volar;
    }

}