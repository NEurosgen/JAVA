public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения (ArithmeticException), которое будет перехвачено
            int result = 10 / 0;  // Деление на ноль
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            // Перехват исключения ArithmeticException
            System.out.println("Ошибка: Деление на ноль");
        }

        try {
            // Генерация второго исключения (ArrayIndexOutOfBoundsException), которое приведет к аварийному завершению
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // Индекс за пределами массива
        } catch (ArrayIndexOutOfBoundsException e) {
            // Этот блок не сработает, так как исключение не будет перехвачено в текущем try
            System.out.println("Этот код не будет выполнен");
        }
    }
}
