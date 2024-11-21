public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }


    @Override
    void makeSound() {
        System.out.println("Meow");

    }

    @Override
    void animalMood(boolean mood) {
        if(mood){
            System.out.println("meow meow meow angry");
        } else {
            System.out.println("purr");
        }
    }

    @Override
    void jump(double distance) {
        System.out.println(getName() + " jumped " + distance + " meters");
    }

    @Override
    boolean eatFood(String foodType) {
        return true;
    }
}
