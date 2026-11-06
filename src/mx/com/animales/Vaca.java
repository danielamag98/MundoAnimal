package mx.com.animales;

public class Vaca extends Animal implements Movible{
    //constructor hija
    public Vaca(String nombre, int edad){
        super(nombre, edad); //super, porque esta usando el constructor de Animal
    }

    @Override
    public void hacerSonido(){
        System.out.print(" | Sonido: Muuuuuu");
    }

    @Override
    public void moverse(){
        System.out.print(" | Moverse: Camina lento");
    }
}
