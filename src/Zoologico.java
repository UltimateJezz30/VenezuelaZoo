import java.util.ArrayList;
import java.util.List;

class Zoologico {
    private List<Animal> animales = new ArrayList<>();

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarAnimales() {
        for (Animal animal : animales) {
            animal.hacerRuido();
            animal.moverse();
        }
    }
}

