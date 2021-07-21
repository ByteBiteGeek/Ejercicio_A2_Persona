package Humanoid;

public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    // constructor

    Persona(){

    }

    Persona (String nombre, String apellidos, int edad, String dni){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }

    // set and get

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setApellido (String apellido) {
        this.apellidos = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String IsOlderIndividual(int edad){

        if (edad >= 18){
            String returnOlder = "es mayor de edad";
            return returnOlder;
        }else{
            String returnNotOlder = "no es mayor de edad";
            return returnNotOlder;
        }
    }
    
}
