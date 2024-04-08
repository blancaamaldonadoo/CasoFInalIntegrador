package ZOOLOGICO.Habitats;

public class HabitatTerrestre extends Habitat{

    boolean puede_caminar;

    public HabitatTerrestre(float temperatura, float humedad, boolean limpieza, boolean puede_caminar){
        super(temperatura, humedad, limpieza);
        this.puede_caminar = puede_caminar;
    }

    public String getpuedeCaminar(){
        if(puede_caminar) return "Puede caminar";
        else return "No puede caminar";
    }

    public void setPuedeCaminar(boolean puede_caminar){
        this.puede_caminar = puede_caminar;
    }

    @Override
    public String toString(){
        String texto="";
        texto+= super.toString() + "\n";
        texto+= getpuedeCaminar() + "\n";
        return texto;
    }
    

}