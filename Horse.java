public class Horse implements Animal{
    private int legs = 4;
    private String sound = "Neigh";
    private String food = "Carrots";
    private String color = "Brown";

    public Horse() {
        System.out.println("Creating Horse Prototype");
    }

    @Override
    public Horse clone() {
        try {
            return (Horse) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Not Supported!");
            return null;
        }
    }

    public void makeSound() {
        System.out.println("Horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }


}