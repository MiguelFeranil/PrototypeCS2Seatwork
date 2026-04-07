public class AnimalRegistry {
    private Sheep sheepPrototype = new Sheep("Default Sheep");
    private Cow cowPrototype = new Cow();
    private Horse horsePrototype = new Horse();

    public Animal createSheep(String name) {
        Sheep newSheep = sheepPrototype.clone();
        newSheep.setName(name);
        return newSheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}