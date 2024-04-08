package ZOOLOGICO;
import ZOOLOGICO.Animales.*;
import ZOOLOGICO.Habitats.*;
import ZOOLOGICO.Visitantes.*;

public class Zoo{
    public static void main(String[] args){
        
        Animales animalt1= new Animal_Terrestre("Terry", "Perro", 1, true, true, false, true, 4, true, true, "Domestico");
        System.out.println(animalt1);

        Habitat h1 = new HabitatTerrestre(25, 50, true, true);
        System.out.println(h1);

        
    }
}