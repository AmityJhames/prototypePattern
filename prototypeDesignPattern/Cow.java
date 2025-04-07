package prototypeDesignPattern;

class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Cow() {
        this.legs = 4;
        this.sound = "Arf";
        this.food = "Hay";
        this.color = "Black and White";
    }

    @Override
    public Animal clone() {
        Cow cow = new Cow();
        cow.legs = this.legs;
        cow.sound = this.sound;
        cow.food = this.food;
        cow.color = this.color;
        return cow;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cow [legs=" + legs + ", sound=" + sound + ", food=" + food + ", color=" + color + "]";
    }
}