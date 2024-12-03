class Parent {
    public final void finalMethod() {
        System.out.println("This is a final method in Parent.");
    }
}

class Child extends Parent {
    // Попытка переопределить final-метод вызовет ошибку компиляции.
    @Override
    public void finalMethod() {
        System.out.println("Attempting to override final method in Child.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.finalMethod(); // Ошибка компиляции
    }
}
