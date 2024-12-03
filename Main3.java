class Parent {
    int number = 10;

    public Parent() {
        System.out.println("Constructor of Parent class");
    }

    public void display() {
        System.out.println("Method from Parent class");
    }
}

class Child extends Parent {
    int number = 20;

    public Child() {
        // 1. Обращение к конструктору суперкласса
        super();
        System.out.println("Constructor of Child class");
    }

    public void show() {
        // 2. Доступ к полю суперкласса
        System.out.println("Field 'number' from Parent class: " + super.number);
        System.out.println("Field 'number' from Child class: " + this.number);
    }

    public void display() {
        // 3. Доступ к методу суперкласса
        super.display();
        System.out.println("Method from Child class");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
        child.display();
    }
}
