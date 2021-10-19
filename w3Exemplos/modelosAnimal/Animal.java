package modelosAnimal;
/**
 * Animal
 */
abstract class Animal {

    protected int quantidadeOlhos = 1;
    public abstract void somAnimal();

    public void sleep(){
        System.out.println("Zzz Zzz");
    }
}