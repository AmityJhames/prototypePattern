package prototypeDesignPattern;

class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep() {
        this.legs = 4;
        this.sound = "KooKoo";
        this.food = "Grass";
        this.name = "Default Sheep";
    }

    @Override
    public Animal clone() {
        Sheep sheep = new Sheep();
        sheep.legs = this.legs;
        sheep.sound = this.sound;
        sheep.food = this.food;
        sheep.name = this.name;
        return sheep;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", legs=" + legs + ", sound=" + sound + ", food=" + food + "]";
    }
}