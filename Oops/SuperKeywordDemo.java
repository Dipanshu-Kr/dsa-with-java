public class SuperKeywordDemo {

    public static void main(String[] args) {

        Horse h = new Horse();
    }
}

class Animal {

    int height = 5;

    Animal(){
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{

    Horse(){
        System.out.println(super.height);
        super.eat();
        System.out.println("Horse constructor called");
    }
}
