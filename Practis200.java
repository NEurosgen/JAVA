interface InterfaceA {
    default void showMessage() {
        System.out.println("Message from InterfaceA");
    }
}

interface InterfaceB {
    default void showMessage() {
        System.out.println("Message from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Переопределение метода для разрешения конфликта
    @Override
    public void showMessage() {
        // Можно вызвать конкретный интерфейс с помощью super
        InterfaceA.super.showMessage();  // Используется метод из InterfaceA
        // InterfaceB.super.showMessage(); // Если нужно использовать метод из InterfaceB
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.showMessage();  // Вызовет переопределенный метод
    }
}
