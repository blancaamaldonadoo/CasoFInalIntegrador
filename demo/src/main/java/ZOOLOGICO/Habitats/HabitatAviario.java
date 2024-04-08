package ZOOLOGICO.Habitats;

public class HabitatAviario extends Habitat{

    boolean puede_volar;

    public HabitatAviario(float temperatura, float humedad, boolean limpieza, boolean puede_volar){
        super(temperatura, humedad, limpieza);
        this.puede_volar = puede_volar;
    }

    //GETTERS Y SETTERS
    public String getPuedeVolar(){
        if (puede_volar) return "Puede volar";
        else return "No puede volar";
     }

    public void setPuedeVolar(boolean puede_volar){
        this.puede_volar = puede_volar;
    }

    @Override
    public String toString(){
        String texto="";
        texto+= super.toString() + "\n";
        texto+= getPuedeVolar() + "\n";
        return texto;
    }
    

}