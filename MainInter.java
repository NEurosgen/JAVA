interface MyInterface {

    // Вложенный статический класс
    static class NestedClass {
        public void display() {
            System.out.println("Method of NestedClass inside the Interface.");
        }
    }

    // Другие методы интерфейса
    void someMethod();
}

class Test implements MyInterface {
    @Override
    public void someMethod() {
        System.out.println("Implementation of someMethod.");
    }
}

public class MainInter {
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса интерфейса
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.display();
        
        // Создание объекта внешнего класса и вызов метода интерфейса
        Test test = new Test();
        test.someMethod();
    }
}
