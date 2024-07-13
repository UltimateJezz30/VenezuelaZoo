import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        zoologico.agregarAnimal(new Leon());
        zoologico.agregarAnimal(new Elefante());
        zoologico.agregarAnimal(new Pajaro());

        zoologico.mostrarAnimales();
    }
}