public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    void jump(double distance) {
        System.out.println(getName() + " jumped " + distance + " meters");
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
