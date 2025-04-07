package prototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;
class AnimalRegistry {
        private Map<String, Animal> prototypes = new HashMap<>();

        public AnimalRegistry() {
            initializePrototypes();
        }

        private void initializePrototypes() {
            prototypes.put("sheep", new Sheep());
            prototypes.put("cow", new Cow());
            prototypes.put("horse", new Horse());
        }

        public Animal createSheep(String name) {
            Sheep sheep = (Sheep) prototypes.get("sheep").clone();
            sheep.setName(name);
            return sheep;
        }

        public Animal createCow() {
            return prototypes.get("cow").clone();
        }

        public Animal createHorse() {
            return prototypes.get("horse").clone();
        }
    }


