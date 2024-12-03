public class OuterClass2 {
    // Поля с разными спецификаторами доступа
    private int privateField = 10;
    protected int protectedField = 20;
    public int publicField = 30;
    int defaultField = 40; // package-private

    // Методы с разными спецификаторами доступа
    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    // Внутренний класс
    public class InnerClass {
        void accessOuterFieldsAndMethods() {
            // Доступ к полям внешнего класса
            System.out.println("privateField: " + privateField); // доступ к private
            System.out.println("protectedField: " + protectedField); // доступ к protected
            System.out.println("publicField: " + publicField); // доступ к public
            System.out.println("defaultField: " + defaultField); // доступ к package-private

            // Доступ к методам внешнего класса
            privateMethod(); // доступ к private
            protectedMethod(); // доступ к protected
            publicMethod(); // доступ к public
            defaultMethod(); // доступ к package-private
        }
    }
}
