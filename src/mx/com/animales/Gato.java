package mx.com.animales;

public class Gato extends Animal {
    //constructor hija
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.println(" | Sonido: Miau miau ");
    }
}
