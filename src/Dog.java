public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }


    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    void animalMood(boolean mood) {
        if(mood){
            System.out.println("growl");
        } else {
            System.out.println("happy dog noises");
        }
    }

    @Override
    boolean eatFood(String foodType) {
        return true;
    }
}
