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

       
            // Генерация второго исключения (ArrayIndexOutOfBoundsException), которое приведет к аварийному завершению
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // Индекс за пределами массива
        
        
    }
}
