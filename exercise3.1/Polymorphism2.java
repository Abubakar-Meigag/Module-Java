class Animal {
    public void makeSound() {}
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Barking...!!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow...!!");
    }
}

class AnimalShow {
    public void perform(Animal animal) {
        animal.makeSound();
    }
}

class Polymorphism2 {
    public static void main(String[] args) {
        AnimalShow show = new AnimalShow();

        show.perform(new Dog());
        show.perform(new Cat());
    }
}
