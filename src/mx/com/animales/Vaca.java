package mx.com.animales;

public class Vaca extends Animal {
    //constructor hija
    public Vaca(String nombre, int edad){
        super(nombre, edad); //super, porque esta usando el constructor de Animal
    }

    @Override
    public void hacerSonido(){
        System.out.println(" | Sonido: Muuuuuu ");
    }
}
