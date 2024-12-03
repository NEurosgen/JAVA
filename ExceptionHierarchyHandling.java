public class MultipleExceptionHandling {
    public static void main(String[] args) {
        try {
            // Генерация нескольких исключений
            throw new ArithmeticException();  // Можно заменить на NullPointerException или другое исключение
        } catch (ArithmeticException | NullPointerException e) {
            // Все эти исключения обрабатываются одинаково
            System.out.println("Ошибка: Неверная операция");
        }
    }
}

public class ExceptionHierarchyHandling {
    public static void main(String[] args) {
        try {
            // Генерация исключения типа SubException
            throw new SubException();
        } catch (SubException e) {
            System.out.println("Поймано SubException");
        } catch (MidException e) {
            System.out.println("Поймано MidException");
        } catch (BaseException e) {
            System.out.println("Поймано BaseException");
        }
    }
}

// Базовый класс исключения
class BaseException extends Exception {}

// Средний класс исключения, наследующий от BaseException
class MidException extends BaseException {}

// Подкласс исключения, наследующий от MidException
class SubException extends MidException {}
