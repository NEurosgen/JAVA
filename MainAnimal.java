class Animal {
  public void sound() {
      System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
      System.out.println("Dog barks");
  }
}

public class MainAnimal {
  public static void main(String[] args) {
      Animal animal = new Animal();
      animal.sound();  // Выведет: Animal makes a sound

      Dog dog = new Dog();
      dog.sound();  // Выведет: Dog barks

      Animal animalDog = new Dog();
      animalDog.sound();  // Выведет: Dog barks (динамическое связывание)
  }
}
