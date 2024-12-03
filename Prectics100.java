// Интерфейс с дефолтным методом и статическим методом
interface MyInterface {
    // Абстрактный метод
    void abstractMethod();
    
    // Неабстрактный метод (default)
    default void defaultMethod() {
        System.out.println("This is the default method");
    }
    
    // Статический метод
    static void staticMethod() {
        System.out.println("This is the static method");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented");
    }
    
    public static void main(String[] args) {
        // Создание объекта класса, который реализует интерфейс
        MyClass myClass = new MyClass();
        
        // Вызов метода интерфейса через объект класса
        myClass.defaultMethod(); // Использование default метода через объект
        myClass.abstractMethod(); // Вызов абстрактного метода, реализованного в классе
        
        // Вызов статического метода интерфейса
        MyInterface.staticMethod(); // Статический метод вызывается через имя интерфейса
    }
}
