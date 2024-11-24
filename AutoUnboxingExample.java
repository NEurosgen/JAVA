public class AutoUnboxingExample {
    public static void main(String[] args) {
        Integer nullInteger = null;

        try {
            int value = nullInteger; // Автораспаковка: бросит NullPointerException
            System.out.println(value);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: NullPointerException при автораспаковке null.");
        }
    }
}

