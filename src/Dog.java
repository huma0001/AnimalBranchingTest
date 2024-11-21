public class Dog extends Animal{


    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    boolean eatFood(String foodType) {
        return true;
    }
}
