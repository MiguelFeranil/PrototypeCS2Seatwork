public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal watame = registry.createSheep("Watame");
        watame.makeSound();
        System.out.println("Type: " + watame.getType() + "\nName: " + ((Sheep) watame).getName());

        Animal milk = registry.createCow();
        milk.makeSound();
        System.out.println("Type: " + milk.getType());

        Animal McQueen = registry.createHorse();
        McQueen.makeSound();
        System.out.println("Type: " + McQueen.getType());

        Animal anotherWatame = registry.createSheep("AnotherWatame");
        anotherWatame.makeSound();
    }
}