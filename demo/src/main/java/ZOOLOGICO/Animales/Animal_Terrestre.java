package ZOOLOGICO.Animales;

public class Animal_Terrestre extends Animales{
    private boolean patas;
    private int numPatas;
    private boolean cola;
    private boolean pelo;
    private String tipo_terrestre;

public Animal_Terrestre(String nombre, String especie, int id, boolean salud, boolean comportamiento, boolean alimentacion,boolean patas, int numPatas, boolean cola, boolean pelo, String tipo_terrestre){
    super(nombre, especie, id, salud, comportamiento, alimentacion);
    this.patas = patas;
    if(patas){
        this.numPatas = numPatas;
    }
    else{
        this.numPatas = 0;
    }
    this.cola = cola;
    this.pelo = pelo;
    this.tipo_terrestre = tipo_terrestre;
}

//GETTERS Y SETTERS:

public boolean getPatas(){
    return patas;
}

public int getNumPatas(){
    return numPatas;
}

public boolean getCola(){
    return cola;
}

public boolean getPelo(){
    return pelo;
}

public String getTipo_Terrestre(){
    return tipo_terrestre;
}

public void setPatas(boolean patas){
    this.patas = patas;
}

public void setNumPatas(int numPatas){
    this.numPatas = numPatas;
}

public void setCola(boolean cola){
    this.cola = cola;
}

public void setPelo(boolean pelo){
    this.pelo = pelo;
}

public void setTipo_Terrestre(String tipo_terrestre){
    this.tipo_terrestre = tipo_terrestre;
}

@Override
public String toString(){
    String texto="";
    texto+= super.toString();
    texto+="Patas: "+patas+"\n";
    texto+="Numero de Patas: "+numPatas+"\n";
    texto+="Cola: "+cola+"\n";
    texto+="Pelo: "+pelo+"\n";
    texto+="Tipo Terrestre: "+tipo_terrestre+"\n";
    return texto;
}

}