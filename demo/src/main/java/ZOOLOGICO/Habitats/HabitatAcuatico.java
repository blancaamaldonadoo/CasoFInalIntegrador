package ZOOLOGICO.Habitats;

public class HabitatAcuatico extends Habitat{

    private boolean puede_nadar;

    public HabitatAcuatico(float temperatura, float humedad, boolean limpieza, boolean puede_nadar){
        super(temperatura, humedad, limpieza);
        this.puede_nadar = puede_nadar;
    }

    public String getpuedeNadar(){
        if(puede_nadar == true){
           return "puede nadar";
        }else{
            return "no puede nadar";
        }
    }

    public void setPuedeNadar(boolean puede_nadar){
        this.puede_nadar = puede_nadar;
    }
    
    @Override
    public String toString(){
        String texto="";
        texto+= super.toString() + "\n";
        texto+= getpuedeNadar() + "\n";
        return texto;
    }
}