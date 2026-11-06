package mx.com.animales;

public class Gato extends Animal implements Movible{
    //constructor hija
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido(){
        System.out.print(" | Sonido: Miau miau");
    }

    @Override
    public void moverse(){
        System.out.print(" | Moverse: Camina sigilosamente");
    }
}
