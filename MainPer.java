class Person {
  private String name;
  private int age;

  // Конструктор
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Переопределение метода equals
  @Override
  public boolean equals(Object obj) {
      // Проверка на само-сравнение и null
      if (this == obj) {
          return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
          return false;
      }
      Person person = (Person) obj;
      return age == person.age && name.equals(person.name);
  }

  // Переопределение метода hashCode
  @Override
  public int hashCode() {
      return 31 * name.hashCode() + age;
  }

  // Метод toString для вывода информации о человеке
  @Override
  public String toString() {
      return "Person{name='" + name + "', age=" + age + "}";
  }
}

public class MainPer {
  public static void main(String[] args) {
      Person person1 = new Person("Alice", 25);
      Person person2 = new Person("Alice", 25);
      Person person3 = new Person("Bob", 30);

      // Пример использования метода equals
      System.out.println(person1.equals(person2)); // true
      System.out.println(person1.equals(person3)); // false
  }
}
