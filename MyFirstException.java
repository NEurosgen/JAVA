// Определение собственного исключения
public class MyFirstException extends Exception {

    // Конструктор без параметров
    public MyFirstException() {
        super("Произошла ошибка в MyFirstException.");
    }

    // Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Класс для демонстрации
public class Main {
    public static void main(String[] args) {
        try {
            // Генерация собственного исключения
            throw new MyFirstException("Что-то пошло не так!");
        } catch (MyFirstException e) {
            // Обработка собственного исключения
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}
