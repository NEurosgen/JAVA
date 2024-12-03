import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        // Пример с использованием класса Formatter
        Formatter formatter = new Formatter();
        
        // Пример с использованием спецификатора %b (логическое значение)
        boolean isActive = true;
        formatter.format("Активный статус: %b%n", isActive);
        
        // Пример с использованием спецификатора %c (символьное значение)
        char symbol = 'A';
        formatter.format("Символ: %c%n", symbol);
        
        // Пример с использованием спецификатора %d (десятичное целое число)
        int number = 123;
        formatter.format("Целое число: %d%n", number);
        
        // Пример с использованием спецификатора %f (десятичное значение с плавающей точкой)
        double decimalValue = 3.14159;
        formatter.format("Число с плавающей точкой: %f%n", decimalValue);
        
        // Пример с использованием спецификатора %s (строковое представление аргумента)
        String greeting = "Привет, мир!";
        formatter.format("Сообщение: %s%n", greeting);
        
        // Выводим результат
        System.out.println(formatter.toString());
        
        // Закрываем Formatter
        formatter.close();
    }
}
