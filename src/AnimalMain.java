public class AnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog("Doggy");
        Cat cat = new Cat("kitty");


        cat.makeSound();
        dog.makeSound();



        cat.eatFood("Chicken");
        dog.eatFood("Poop");

        System.out.println(dog.getName());
        System.out.println(cat.getName());


        dog.animalMood(true);
        dog.animalMood(false);
        cat.animalMood(true);
        cat.animalMood(false);
    }
}
