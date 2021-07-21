package Humanoid;
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner ff = new Scanner(System.in);
        Scanner fL = new Scanner(System.in);

        Persona individuo0 = new Persona();
        Persona individuo1 = new Persona();

        System.out.println("Introduce los datos de la primera persona");
        System.out.print("DNI: ");
        individuo0.setDni(ff.nextLine());

        System.out.print("Nombre: ");
        individuo0.setNombre(ff.nextLine());

        System.out.print("Apellidos: ");
        individuo0.setApellido(ff.nextLine());

        System.out.print("Edad: ");
        individuo0.setEdad(fL.nextInt());

        System.out.println("Introduce los datos de la segunda persona");
        System.out.print("DNI: ");
        individuo1.setDni(ff.nextLine());

        System.out.print("Nombre: ");
        individuo1.setNombre(ff.nextLine());

        System.out.print("Apellidos: ");
        individuo1.setApellido(ff.nextLine());

        System.out.print("Edad: ");
        individuo1.setEdad(fL.nextInt());

        System.out.println(individuo0.getNombre()+" "+individuo0.getApellidos()+" con DNI "+individuo0.getDni()+ " "+individuo0.IsOlderIndividual(individuo0.getEdad()));
        System.out.println(individuo1.getNombre()+" "+individuo1.getApellidos()+" con DNI "+individuo1.getDni()+ " "+individuo1.IsOlderIndividual(individuo1.getEdad()));
    }
}
