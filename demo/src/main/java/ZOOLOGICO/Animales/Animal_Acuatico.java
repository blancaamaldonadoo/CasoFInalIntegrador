package ZOOLOGICO.Animales;

public class Animal_Acuatico extends Animales{
    boolean aletas;
    boolean branquias;
    boolean escamas;
    boolean cola;
    String tipo_acuatico;

    public Animal_Acuatico(String nombre, String especie, int id, boolean salud, boolean comportamiento, boolean alimentacion,boolean aletas, boolean escamas, boolean cola, String tipo_acuatico){
        super(nombre, especie, id, salud, comportamiento, alimentacion);
        this.aletas = aletas;
        this.escamas = escamas;
        this.cola=cola;
        this.tipo_acuatico = tipo_acuatico;
    }

    //GETTERS Y SETTERS:

    public boolean getAletas(){
        return aletas;
    }

    public boolean getBranquias(){
        return branquias;
    }

    public boolean getEscamas(){
        return escamas;
    }

    public boolean getCola(){
        return cola;
    }

    public String getTipo_Acuatico(){
        return tipo_acuatico;
    }

    public void setAletas(boolean aletas){
        this.aletas = aletas;
    }

    public void setBranquias(boolean branquias){
        this.branquias = branquias;
    }

    public void setEscamas(boolean escamas){
        this.escamas = escamas;
    }

    public void setCola(boolean cola){
        this.cola = cola;
    }

    public void setTipo_Acuatico(String tipo_acuatico){
        this.tipo_acuatico = tipo_acuatico;
    }

    @Override
    public String toString(){
        String texto="";
        texto+= super.toString();
        texto+="Aletas: "+aletas+"\n";
        texto+="Branquias: "+branquias+"\n";
        texto+="Escamas: "+escamas+"\n";
        texto+="Cola: "+cola+"\n";
        texto+="Tipo Acuatico: "+tipo_acuatico+"\n";
        return texto;
    }

}