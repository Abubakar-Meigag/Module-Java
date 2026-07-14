

class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {super(name);}

    public void bark(){
        System.out.println(getName() + " is barking...!!");
    }
}

class Cat extends Animal {
    public Cat(String name) {super(name);}

    public void meow(){
        System.out.println(getName() + " says meow...");
    }
}

class Parrot extends Animal {
    public Parrot(String name) {super(name);}

    public void squawk(){
        System.out.println(getName() + " says parrot...!!");
    }
}

class AnimalShow {

    public void perform(Animal animal){

        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bark();
        } else if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.meow();
        } else {
            System.out.println("Unknown animal type");
        }
    }
}

class PolymorphismConcept {
    public static void main(String[] args) {
        AnimalShow show = new AnimalShow();

        show.perform(new Dog("Dog"));
        show.perform(new Cat("Cat"));
        show.perform(new Parrot("Parrot"));

    }
}