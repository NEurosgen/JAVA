class Animal {
  public void sound() {
      System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  // Ошибка: неверное имя метода (перепутано с "sounds")
  @Override
  public void sounds() {  
      System.out.println("Dog barks");
  }
}

public class MainABB {
  public static void main(String[] args) {
      Dog dog = new Dog();
      dog.sounds();  // Ошибка компиляции из-за аннотации @Override
  }
}
