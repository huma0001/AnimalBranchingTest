public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    abstract void makeSound();

    abstract void animalMood(boolean mood);


    abstract boolean eatFood(String foodType);
}
