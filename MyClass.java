package package1;

public class MyClass {
    private int privateField = 1;
    int defaultField = 2;  // Пакетная видимость
    protected int protectedField = 3;
    public int publicField = 4;

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }
}
