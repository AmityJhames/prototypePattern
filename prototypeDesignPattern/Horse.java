package prototypeDesignPattern;

class Horse implements Animal {
        private int legs;
        private String sound;
        private String food;
        private String color;

        public Horse() {
            this.legs = 4;
            this.sound = "Meow";
            this.food = "Hay";
            this.color = "Brown";
        }

        @Override
        public Animal clone() {
            Horse horse = new Horse();
            horse.legs = this.legs;
            horse.sound = this.sound;
            horse.food = this.food;
            horse.color = this.color;
            return horse;
        }

        @Override
        public void makeSound() {
            System.out.println(sound);
        }

        @Override
        public String getType() {
            return "Horse";
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Horse [legs=" + legs + ", sound=" + sound + ", food=" + food + ", color=" + color + "]";
        }
    }

