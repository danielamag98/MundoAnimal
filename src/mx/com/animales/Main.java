package mx.com.animales;

public class Main {
    public static void main(String[] args) {
        //ArrayList de animales
        Animal[] listaAnimales = {
                new Perro("Milo", 4),
                new Perro("Hoschi", 7),
                new Gato("Daicy", 1),
                new Vaca("Lola", 11),
        };

        //Ciclo forEach e invocar mostrarInformacion y hacerSonido
        for(Animal animal:listaAnimales){
            animal.mostrarInformacion();
            animal.hacerSonido();

            //usar movible para invocar el movimiento
            //instaceof . evalua si el objeto al que apunta la variable animal implementa la interfaz movible
            if(animal instanceof Movible movible){
                movible.moverse();
            }
        }
    }
}