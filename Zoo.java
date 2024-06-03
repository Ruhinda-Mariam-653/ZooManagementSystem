 class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Animal sound");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println("Animal is eating " + foodType);
    }
}
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }

    @Override
    public void eat() {
        System.out.println("Eating grass");
    }
}

class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chatter");
    }

    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal elephant = new Elephant("Ella", 10);
        Animal monkey = new Monkey("Momo", 3);
        System.out.println("Lion:");
        lion.makeSound();
        lion.eat();
        lion.makeSound(3);
        lion.eat("steak"); 
        System.out.println("\nElephant:");
        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2); 
        elephant.eat("fruits");
        System.out.println("\nMonkey:");
        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4); 
        monkey.eat("nuts"); 
    }
}
