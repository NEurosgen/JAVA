public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);  // Индекс за пределами массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс массива вне диапазона");
        }
    }
}
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-1);  // Некорректное значение
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Неверный возраст");
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new String("Hello");
        try {
            Integer num = (Integer) obj;  // Ошибка приведения типа
        } catch (ClassCastException e) {
            System.out.println("Ошибка: Невозможно привести String к Integer");
        }
    }
}
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();  // Попытка вызвать метод на null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Обращение к методу на null");
        }
    }
}
