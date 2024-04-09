package ZOOLOGICO;
import ZOOLOGICO.Animales.*;
import ZOOLOGICO.Habitats.*;
import ZOOLOGICO.Visitantes.*;
import java.util.Scanner;

public class Zoo{

    public static void main(String[] args){
        
        System.out.println("Bienvenidos al ZOOLOGICO");
        System.out.println("Ingrese el número de opción a la que quiera acceder: ");
        System.out.println(" 1. Crear un animal. \n 2. Crear un habitat. \n 3. Crear un nuevo visitante.");
     
        Scanner sc= new Scanner(System.in);
        int opcion = sc.nextInt();

        switch(opcion){
            case 1: 
                System.out.println("Ingrese el tipo de animal que desea crear: ");
                System.out.println(" 1. Animal Acuático. \n 2. Animal Terrestre. \n 3. Animal Aéreo.");
                int tipoAnimal = sc.nextInt();
                if(tipoAnimal==1){
                    Animal_Acuatico animal= new Animal_Acuatico();
                    animal.crearAnimalAcuatico();
                }
                
        }
       
    }
}