public class Sheep implements Animal{
    private int legs = 4;
    private String sound = "Baaaah";
    private String food = "Grass";
    private String name;

    public Sheep(String name) {
        this.name = name;
        System.out.println("Creating Sheep Prototype");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Sheep clone(){
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Not Supported!");
            return null;
        }
    }

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}