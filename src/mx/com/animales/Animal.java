package mx.com.animales;
//Abstract no puede crear un objeto, simplemente sirve como plantilla pero no se puede instanciar

public abstract class Animal {
    private String nombre;
    private int edad;

    //Constructor
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo concreto (mostrarInformacion)
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " | Edad: "+edad);
    }

    //Metodo abstracto (sin implementacion)
    public abstract void hacerSonido();

    //los get y sets
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
}
