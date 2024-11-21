public class Cat extends Animal{


    @Override
    void makeSound() {
        System.out.println("Meow");

    }

    @Override
    boolean eatFood(String foodType) {
        return true;
    }
}
