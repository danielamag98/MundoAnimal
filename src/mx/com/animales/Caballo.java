package mx.com.animales;

public class Caballo extends Animal implements Movible{
    //constructor hija
    public Caballo(String nombre, int edad){
        super(nombre, edad);
    }

    //implementar hacerSonido() con Override
    @Override
    public void hacerSonido(){
        System.out.print(" | Sonido: Brrrr");
    }

    @Override
    public void moverse(){
        System.out.print(" | Moverse: Corre velozmente");
    }
}
