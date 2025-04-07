package prototypeDesignPattern;

public class TestAnimal {

    public static void main(String[] args) {

    AnimalRegistry registry = new AnimalRegistry();

    // Create and customize a sheep
    Animal sheep1 = registry.createSheep("Dolly");
    System.out.println(sheep1);
    sheep1.makeSound();

    // Create another sheep
    Animal sheep2 = registry.createSheep("Molly");
    System.out.println(sheep2);

    // Create a cow
    Animal cow = registry.createCow();
    System.out.println(cow);
    cow.makeSound();

    // Create a horse
    Animal horse = registry.createHorse();
    System.out.println(horse);
    horse.makeSound();
}
}