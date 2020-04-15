package Inheritance;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);

	    Fish fish = new Fish("Fishma", 1, 1, 6, 5, 2, 2, 4);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
    //     dog.eat();
    //    dog.walk();
       dog.run();
       fish.rest();

    }
}
