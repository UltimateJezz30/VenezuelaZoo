abstract public class AnimalBase implements Animal {
    @Override
    public void hacerRuido() {
        System.out.println("El animal hace ruido.");
    }

    @Override
    public void moverse() {
        System.out.println("El animal se mueve.");
    }
}
