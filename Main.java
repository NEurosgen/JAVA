final class FinalClass {
    public void display() {
        System.out.println("This is a method in a final class.");
    }
}

// Попытка наследоваться от final-класса вызовет ошибку компиляции.
class SubClass extends FinalClass {
    @Override
    public void display() {
        System.out.println("Attempting to override method from FinalClass.");
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
