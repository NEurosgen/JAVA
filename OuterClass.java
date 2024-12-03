public class OuterClass {

    // Приватный внутренний класс
    private class PrivateInner {
        void printMessage() {
            System.out.println("Private inner class");
        }
    }

    // Защищенный внутренний класс
    protected class ProtectedInner {
        void printMessage() {
            System.out.println("Protected inner class");
        }
    }

    // Публичный внутренний класс
    public class PublicInner {
        void printMessage() {
            System.out.println("Public inner class");
        }
    }

    // Внутренний класс с доступом по умолчанию (package-private)
    class DefaultInner {
        void printMessage() {
            System.out.println("Default inner class");
        }
    }
}
