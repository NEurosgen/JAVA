package package2;

import package1.MyClass;

public class TestClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // System.out.println(obj.privateField);  // Ошибка: privateField недоступен
        // System.out.println(obj.defaultField);  // Ошибка: defaultField недоступен в другом пакете
        // System.out.println(obj.protectedField);  // Ошибка: protectedField недоступен в другом пакете
        System.out.println(obj.publicField);  // Доступен: 4

        // obj.privateMethod();  // Ошибка: privateMethod недоступен
        // obj.defaultMethod();  // Ошибка: defaultMethod недоступен
        // obj.protectedMethod();  // Ошибка: protectedMethod недоступен
        obj.publicMethod();  // Доступен: Public method
    }
}
