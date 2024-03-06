
public class Zoo{
    public static void main(String[] args){
        
        Habitats.HabitatTerrestre habitat1 = new Habitats.HabitatTerrestre(25, 60, true, true);
        Habitats.HabitatTerrestre habitat2 = new Habitats.HabitatTerrestre(30, 70, false, false);
        Habitats.HabitatAcuatico habitat3 = new Habitats.HabitatAcuatico(20, 80, true, true);
        Habitats.HabitatAcuatico habitat4 = new Habitats.HabitatAcuatico(25, 90, false, false);
        
        Animales.Animales animal1 = new Animales.Animales("Leon", "Felino", 1, true, true, true);
        Animales.Animales animal2 = new Animales.Animales("Tigre", "Felino", 2, true, true, true);
        Animales.Animales animal3 = new Animales.Animales("Cocodrilo", "Reptil", 3, true, true, true);
        Animales.Animales animal4 = new Animales.Animales("Tiburon", "Pez", 4, true, true, true);
        
        Visitantes.Visitantes visitante1 = new Visitantes.Visitantes("Juan", "Perez", 1, "Adulto");
        Visitantes.Visitantes visitante2 = new Visitantes.Visitantes("Maria", "Lopez", 2, "Adulto");
        Visitantes.Visitantes visitante3 = new Visitantes.Visitantes("Pedro", "Gomez", 3, "Adulto");
        Visitantes.Visitantes visitante4 = new Visitantes.Visitantes("Ana", "Gutierrez", 4, "Adulto");
        
        System.out.println("Habitat 1: " + habitat1.toString());
        System.out.println("Habitat 2: " + habitat2.toString());
        System.out.println("Habitat 3: " + habitat3.toString());
        System.out.println("Habitat 4: " + habitat4.toString());
        
        System.out.println("Animal 1: " + animal1.getNombre());
        System.out.println("Animal 2: " + animal2.getNombre());
        System.out.println("Animal 3: " + animal3.getNombre()); 
        System.out.println("Animal 4: " + animal4.getNombre());

        System.out.println("Visitante 1: " + visitante1.getNombre());
        System.out.println("Visitante 2: " + visitante2.getNombre());
        System.out.println("Visitante 3: " + visitante3.getNombre());
        System.out.println("Visitante 4: " + visitante4.getNombre());

    }
}