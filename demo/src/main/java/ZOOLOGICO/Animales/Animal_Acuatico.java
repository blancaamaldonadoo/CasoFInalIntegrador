package ZOOLOGICO.Animales;
import java.util.Scanner;

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

    public Animal_Acuatico(){}

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

    public void crearAnimalAcuatico(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del animal: ");
        String nombre = sc.nextLine();
        setNombre(nombre);

        System.out.println("Ingrese la especie del animal: ");    
        String especie = sc.nextLine();
        setEspecie(especie);

        System.out.println("Ingrese el id del animal: ");
        int id = sc.nextInt();
        setId(id);

        System.out.println("Ingrese si el animal tiene buen estado de salud: ");
        String salud = sc.nextLine();
        if(salud=="si") setSalud(true);
        else setSalud(false);

        System.out.println("Ingrese el comportamiento del animal: ");
        boolean comportamiento = sc.nextBoolean();
        setComportamiento(comportamiento);

        System.out.println("Ingrese la alimentacion del animal: ");
        boolean alimentacion = sc.nextBoolean();
        setAlimentacion(alimentacion);

        System.out.println("Ingrese si tiene aletas el animal: ");
        String aletas = sc.nextLine();
        if(aletas=="si") setAletas(true);
        else setAletas(false);

        System.out.println("Ingrese si tiene branquias el animal: ");
        String branquias = sc.nextLine();
        if (branquias=="si") setBranquias(true);
        else setBranquias(false);

        System.out.println("Ingrese si tiene escamas el animal: ");
        String escamas = sc.nextLine();
        if (escamas=="si") setEscamas(true);
        else setEscamas(false);

        System.out.println("Ingrese si tiene cola el animal: ");
        String cola = sc.nextLine();
        if (cola=="si") setCola(true);
        else setCola(false);


        System.out.println("Ingrese el tipo acuatico del animal: ");
        String tipo_acuatico = sc.nextLine();
        setTipo_Acuatico(tipo_acuatico);

        sc.close();
    }


}