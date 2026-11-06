package mx.com.animales;

public class Perro extends Animal implements Movible{
    //constructor hija
    public Perro(String nombre, int edad){
        super(nombre, edad); //super, porque esta usando el constructor de Animal
    }

    //implementar hacerSonido() con Override
    @Override
    public void hacerSonido(){
        System.out.println(" | Sonido: Guau guau ");
    }

    @Override
    public void moverse(){
        System.out.println(" | Moverse: Corre");
    }
}

