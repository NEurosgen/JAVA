public class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Доступ к публичному внутреннему классу
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.printMessage();  // "Public inner class"

        // Доступ к защищенному внутреннему классу
        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.printMessage();  // "Protected inner class"

        // Доступ к внутреннему классу с доступом по умолчанию (package-private)
        OuterClass.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.printMessage();  // "Default inner class"

        // Доступ к приватному внутреннему классу невозможен
        // OuterClass.PrivateInner privateInner = outer.new PrivateInner();  // Ошибка компиляции
    }
}
