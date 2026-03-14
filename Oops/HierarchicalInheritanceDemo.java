public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();

        Bird b = new Bird();
        b.fly();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird flies");
    }
}
