public class OuterClass3 {
    // Внешний класс может обращаться только к public членам внутреннего класса
    public class PublicInner {
        public int publicField = 10;
        private int privateField = 20;

        public void publicMethod() {
            System.out.println("Public method in PublicInner");
        }

        private void privateMethod() {
            System.out.println("Private method in PublicInner");
        }
    }

    // Внешний класс не может обращаться к protected и private методам, если они не public
    private class PrivateInner {
        public int publicField = 30;
        private int privateField = 40;

        public void publicMethod() {
            System.out.println("Public method in PrivateInner");
        }

        private void privateMethod() {
            System.out.println("Private method in PrivateInner");
        }
    }

    // Пример метода во внешнем классе
    public void createAndAccessInnerClasses() {
        // Создание экземпляра внутреннего класса
        PublicInner publicInner = new PublicInner();
        System.out.println("Accessing public field in PublicInner: " + publicInner.publicField);
        publicInner.publicMethod();
        
        // Внешний класс не может получить доступ к privateField и privateMethod
        // Ошибка: privateField, privateMethod не доступны для внешнего класса
        // System.out.println(publicInner.privateField); // Ошибка
        // publicInner.privateMethod(); // Ошибка
    }
}
